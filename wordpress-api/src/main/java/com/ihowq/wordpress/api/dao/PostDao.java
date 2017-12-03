package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.post.Post;
import com.ihowq.wordpress.api.model.pojo.post.PostQuery;
import com.ihowq.wordpress.api.model.pojo.post.PostWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostDao {
    long countByQuery(PostQuery query);

    int deleteByQuery(PostQuery query);

    int deleteByPrimaryKey(Long id);

    int insert(PostWithBLOBs record);

    int insertSelective(PostWithBLOBs record);

    List<PostWithBLOBs> selectByQueryWithBLOBs(PostQuery query);

    List<Post> selectByQuery(PostQuery query);

    PostWithBLOBs selectByPrimaryKey(Long id);

    int updateByQuerySelective(@Param("record") PostWithBLOBs record, @Param("query") PostQuery query);

    int updateByQueryWithBLOBs(@Param("record") PostWithBLOBs record, @Param("query") PostQuery query);

    int updateByQuery(@Param("record") Post record, @Param("query") PostQuery query);

    int updateByPrimaryKeySelective(PostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostWithBLOBs record);

    int updateByPrimaryKey(Post record);
}