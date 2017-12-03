package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.user.User;
import com.ihowq.wordpress.api.model.pojo.user.UserQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    long countByQuery(UserQuery query);

    int deleteByQuery(UserQuery query);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByQuery(UserQuery query);

    User selectByPrimaryKey(Long id);

    int updateByQuerySelective(@Param("record") User record, @Param("query") UserQuery query);

    int updateByQuery(@Param("record") User record, @Param("query") UserQuery query);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}