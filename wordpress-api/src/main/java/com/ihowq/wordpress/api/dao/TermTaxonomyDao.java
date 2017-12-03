package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.termtaxonomy.TermTaxonomy;
import com.ihowq.wordpress.api.model.pojo.termtaxonomy.TermTaxonomyQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TermTaxonomyDao {
    long countByQuery(TermTaxonomyQuery query);

    int deleteByQuery(TermTaxonomyQuery query);

    int deleteByPrimaryKey(Long termTaxonomyId);

    int insert(TermTaxonomy record);

    int insertSelective(TermTaxonomy record);

    List<TermTaxonomy> selectByQueryWithBLOBs(TermTaxonomyQuery query);

    List<TermTaxonomy> selectByQuery(TermTaxonomyQuery query);

    TermTaxonomy selectByPrimaryKey(Long termTaxonomyId);

    int updateByQuerySelective(@Param("record") TermTaxonomy record, @Param("query") TermTaxonomyQuery query);

    int updateByQueryWithBLOBs(@Param("record") TermTaxonomy record, @Param("query") TermTaxonomyQuery query);

    int updateByQuery(@Param("record") TermTaxonomy record, @Param("query") TermTaxonomyQuery query);

    int updateByPrimaryKeySelective(TermTaxonomy record);

    int updateByPrimaryKeyWithBLOBs(TermTaxonomy record);

    int updateByPrimaryKey(TermTaxonomy record);
}