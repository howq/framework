package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.postmeta.PostMeta;
import com.ihowq.wordpress.api.model.pojo.postmeta.PostMetaQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostMetaDao {
    long countByQuery(PostMetaQuery query);

    int deleteByQuery(PostMetaQuery query);

    int deleteByPrimaryKey(Long metaId);

    int insert(PostMeta record);

    int insertSelective(PostMeta record);

    List<PostMeta> selectByQueryWithBLOBs(PostMetaQuery query);

    List<PostMeta> selectByQuery(PostMetaQuery query);

    PostMeta selectByPrimaryKey(Long metaId);

    int updateByQuerySelective(@Param("record") PostMeta record, @Param("query") PostMetaQuery query);

    int updateByQueryWithBLOBs(@Param("record") PostMeta record, @Param("query") PostMetaQuery query);

    int updateByQuery(@Param("record") PostMeta record, @Param("query") PostMetaQuery query);

    int updateByPrimaryKeySelective(PostMeta record);

    int updateByPrimaryKeyWithBLOBs(PostMeta record);

    int updateByPrimaryKey(PostMeta record);
}