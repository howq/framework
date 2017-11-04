package org.bymarx.framework.sso.service.cache.impl;


import org.bymarx.framework.common.cache.impl.RedisCacheService;
import org.bymarx.framework.common.util.Result;
import org.bymarx.framework.common.util.ValSystemException;
import org.bymarx.framework.sso.service.cache.CacheService;
import org.bymarx.framework.sso.service.model.CustLoginSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分布式缓存服务。
 *
 * @author howq
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    private static final Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);

    @Resource(name = "redisCacheService")
    private RedisCacheService redisCacheService;

    @Override
    public void setCustLoginSession(CustLoginSession session) {
        if (session != null) {
            logger.debug("Put login session to cahce. token:" + session.getToken());

            int custLoginSessionExpireTime = 60 * 60 * 30;

            Result<String> result = redisCacheService.saveByObject(session.getToken(), session, custLoginSessionExpireTime);
            if (!result.isSuccess()) {
                logger.warn("Failed to save login session to cache.");
                throw new ValSystemException("Failed to save login session to cache.");
            }
            logger.debug("Put login session to redis success");
        }
    }

    @Override
    public CustLoginSession getCustLoginSession(String token) {
        if (token != null) {

            logger.debug("Get login session from cache. token:" + token);

            CustLoginSession loginSession = null;
            loginSession = (CustLoginSession) redisCacheService.getByClass(token, CustLoginSession.class);

            return loginSession;
        }

        return null;
    }

    @Override
    public void removeCustLoginSession(String token) {
        if (token != null) {

            logger.debug("Remove login session from cahce. token:" + token);

            redisCacheService.delByKey(token);
        }
    }

    @Override
    public boolean saveUserToken(String username, List<String> tokenList) {
        if (!StringUtils.isEmpty(username)) {
            logger.debug("Put username to cahce. username:" + username);

            Result<String> result = redisCacheService.saveByObject(username, tokenList);
            if (!result.isSuccess()) {
                logger.warn("Failed to save username to cache.");
                throw new RuntimeException("Failed to save username to cache.");
            }
            logger.debug("Put username to redis success");
            return result.isSuccess();
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<String> getUserToken(String username) {
        if (!StringUtils.isEmpty(username)) {
            return (List<String>) redisCacheService.getByClass(username, List.class);
        }
        return null;
    }
}
