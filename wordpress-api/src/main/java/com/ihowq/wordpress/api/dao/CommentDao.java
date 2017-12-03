package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.comment.Comment;
import com.ihowq.wordpress.api.model.pojo.comment.CommentQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentDao {
    long countByQuery(CommentQuery query);

    int deleteByQuery(CommentQuery query);

    int deleteByPrimaryKey(Long commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByQueryWithBLOBs(CommentQuery query);

    List<Comment> selectByQuery(CommentQuery query);

    Comment selectByPrimaryKey(Long commentId);

    int updateByQuerySelective(@Param("record") Comment record, @Param("query") CommentQuery query);

    int updateByQueryWithBLOBs(@Param("record") Comment record, @Param("query") CommentQuery query);

    int updateByQuery(@Param("record") Comment record, @Param("query") CommentQuery query);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
}