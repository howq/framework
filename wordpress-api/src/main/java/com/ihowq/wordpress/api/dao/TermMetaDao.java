package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.termmeta.TermMeta;
import com.ihowq.wordpress.api.model.pojo.termmeta.TermMetaQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TermMetaDao {
    long countByQuery(TermMetaQuery query);

    int deleteByQuery(TermMetaQuery query);

    int deleteByPrimaryKey(Long metaId);

    int insert(TermMeta record);

    int insertSelective(TermMeta record);

    List<TermMeta> selectByQueryWithBLOBs(TermMetaQuery query);

    List<TermMeta> selectByQuery(TermMetaQuery query);

    TermMeta selectByPrimaryKey(Long metaId);

    int updateByQuerySelective(@Param("record") TermMeta record, @Param("query") TermMetaQuery query);

    int updateByQueryWithBLOBs(@Param("record") TermMeta record, @Param("query") TermMetaQuery query);

    int updateByQuery(@Param("record") TermMeta record, @Param("query") TermMetaQuery query);

    int updateByPrimaryKeySelective(TermMeta record);

    int updateByPrimaryKeyWithBLOBs(TermMeta record);

    int updateByPrimaryKey(TermMeta record);
}