package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.usermeta.UserMeta;
import com.ihowq.wordpress.api.model.pojo.usermeta.UserMetaQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMetaDao {
    long countByQuery(UserMetaQuery query);

    int deleteByQuery(UserMetaQuery query);

    int deleteByPrimaryKey(Long umetaId);

    int insert(UserMeta record);

    int insertSelective(UserMeta record);

    List<UserMeta> selectByQueryWithBLOBs(UserMetaQuery query);

    List<UserMeta> selectByQuery(UserMetaQuery query);

    UserMeta selectByPrimaryKey(Long umetaId);

    int updateByQuerySelective(@Param("record") UserMeta record, @Param("query") UserMetaQuery query);

    int updateByQueryWithBLOBs(@Param("record") UserMeta record, @Param("query") UserMetaQuery query);

    int updateByQuery(@Param("record") UserMeta record, @Param("query") UserMetaQuery query);

    int updateByPrimaryKeySelective(UserMeta record);

    int updateByPrimaryKeyWithBLOBs(UserMeta record);

    int updateByPrimaryKey(UserMeta record);
}