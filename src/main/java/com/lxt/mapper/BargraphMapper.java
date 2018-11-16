package com.lxt.mapper;

import com.lxt.model.Bargraph;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BargraphMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bargraph record);

    int insertSelective(Bargraph record);

    Bargraph selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bargraph record);

    int updateByPrimaryKey(Bargraph record);

    /**
     * 查询所有柱状图的数据--echarts
     * @return
     */
    List<Bargraph> queryList();
}