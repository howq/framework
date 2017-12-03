package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.link.Link;
import com.ihowq.wordpress.api.model.pojo.link.LinkQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkDao {
    long countByQuery(LinkQuery query);

    int deleteByQuery(LinkQuery query);

    int deleteByPrimaryKey(Long linkId);

    int insert(Link record);

    int insertSelective(Link record);

    List<Link> selectByQueryWithBLOBs(LinkQuery query);

    List<Link> selectByQuery(LinkQuery query);

    Link selectByPrimaryKey(Long linkId);

    int updateByQuerySelective(@Param("record") Link record, @Param("query") LinkQuery query);

    int updateByQueryWithBLOBs(@Param("record") Link record, @Param("query") LinkQuery query);

    int updateByQuery(@Param("record") Link record, @Param("query") LinkQuery query);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKeyWithBLOBs(Link record);

    int updateByPrimaryKey(Link record);
}