package com.lxt.mapper;

import com.lxt.model.PieImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PieImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PieImage record);

    int insertSelective(PieImage record);

    PieImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PieImage record);

    int updateByPrimaryKey(PieImage record);

    List<PieImage> queryPieImageList();
}