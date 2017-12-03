package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.commentmeta.CommentMeta;
import com.ihowq.wordpress.api.model.pojo.commentmeta.CommentMetaQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMetaDao {
    long countByQuery(CommentMetaQuery query);

    int deleteByQuery(CommentMetaQuery query);

    int deleteByPrimaryKey(Long metaId);

    int insert(CommentMeta record);

    int insertSelective(CommentMeta record);

    List<CommentMeta> selectByQueryWithBLOBs(CommentMetaQuery query);

    List<CommentMeta> selectByQuery(CommentMetaQuery query);

    CommentMeta selectByPrimaryKey(Long metaId);

    int updateByQuerySelective(@Param("record") CommentMeta record, @Param("query") CommentMetaQuery query);

    int updateByQueryWithBLOBs(@Param("record") CommentMeta record, @Param("query") CommentMetaQuery query);

    int updateByQuery(@Param("record") CommentMeta record, @Param("query") CommentMetaQuery query);

    int updateByPrimaryKeySelective(CommentMeta record);

    int updateByPrimaryKeyWithBLOBs(CommentMeta record);

    int updateByPrimaryKey(CommentMeta record);
}