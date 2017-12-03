package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.term.Term;
import com.ihowq.wordpress.api.model.pojo.term.TermQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TermDao {
    long countByQuery(TermQuery query);

    int deleteByQuery(TermQuery query);

    int deleteByPrimaryKey(Long termId);

    int insert(Term record);

    int insertSelective(Term record);

    List<Term> selectByQuery(TermQuery query);

    Term selectByPrimaryKey(Long termId);

    int updateByQuerySelective(@Param("record") Term record, @Param("query") TermQuery query);

    int updateByQuery(@Param("record") Term record, @Param("query") TermQuery query);

    int updateByPrimaryKeySelective(Term record);

    int updateByPrimaryKey(Term record);
}