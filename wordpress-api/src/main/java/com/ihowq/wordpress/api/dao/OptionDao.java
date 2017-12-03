package com.ihowq.wordpress.api.dao;

import com.ihowq.wordpress.api.model.pojo.option.Option;
import com.ihowq.wordpress.api.model.pojo.option.OptionQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OptionDao {
    long countByQuery(OptionQuery query);

    int deleteByQuery(OptionQuery query);

    int deleteByPrimaryKey(Long optionId);

    int insert(Option record);

    int insertSelective(Option record);

    List<Option> selectByQueryWithBLOBs(OptionQuery query);

    List<Option> selectByQuery(OptionQuery query);

    Option selectByPrimaryKey(Long optionId);

    int updateByQuerySelective(@Param("record") Option record, @Param("query") OptionQuery query);

    int updateByQueryWithBLOBs(@Param("record") Option record, @Param("query") OptionQuery query);

    int updateByQuery(@Param("record") Option record, @Param("query") OptionQuery query);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKeyWithBLOBs(Option record);

    int updateByPrimaryKey(Option record);
}