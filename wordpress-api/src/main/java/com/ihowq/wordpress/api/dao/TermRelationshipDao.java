package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.termrelationship.TermRelationship;
import com.ihowq.wordpress.api.model.pojo.termrelationship.TermRelationshipKey;
import com.ihowq.wordpress.api.model.pojo.termrelationship.TermRelationshipQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TermRelationshipDao {
    long countByQuery(TermRelationshipQuery query);

    int deleteByQuery(TermRelationshipQuery query);

    int deleteByPrimaryKey(TermRelationshipKey key);

    int insert(TermRelationship record);

    int insertSelective(TermRelationship record);

    List<TermRelationship> selectByQuery(TermRelationshipQuery query);

    TermRelationship selectByPrimaryKey(TermRelationshipKey key);

    int updateByQuerySelective(@Param("record") TermRelationship record, @Param("query") TermRelationshipQuery query);

    int updateByQuery(@Param("record") TermRelationship record, @Param("query") TermRelationshipQuery query);

    int updateByPrimaryKeySelective(TermRelationship record);

    int updateByPrimaryKey(TermRelationship record);
}