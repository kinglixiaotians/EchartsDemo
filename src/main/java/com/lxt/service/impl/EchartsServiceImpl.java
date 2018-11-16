package com.lxt.service.impl;

import com.lxt.mapper.BargraphMapper;
import com.lxt.mapper.PieImageMapper;
import com.lxt.model.Bargraph;
import com.lxt.model.PieImage;
import com.lxt.service.EchartsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 李啸天 on 2018/11/13.
 */
@Service
@Slf4j
public class EchartsServiceImpl implements EchartsService {

    @Autowired
    private BargraphMapper bargraphMapper;

    @Autowired
    private PieImageMapper pieImageMapper;

    @Override
    public Map<String,Object> queryBarGraphList(){
        //查询出所有柱状图的数据
        List<Bargraph> list = bargraphMapper.queryList();
        log.info("查询出数据库柱状图数据共{}条",list.size());
        //装载查询出的不同的数据
        Map<String,Object> maps = new HashMap<>();
        String [] counts = new String[list.size()];
        String [] names = new String[list.size()];
        int i=0;
        for(Bargraph bargraph:list){
            counts[i] = bargraph.getCount();
            names[i] = bargraph.getName();
            i++;
        }
        maps.put("counts",counts);
        maps.put("names",names);
        return maps;
    }

    @Override
    public Map<String, Object> queryPieImageList() {
        List<PieImage> list = pieImageMapper.queryPieImageList();
        log.info("查询出数据库扇形图数据共{}条",list.size());
        //装载查询出的不同的数据
        Map<String,Object> maps = new HashMap<>();
        String [] values = new String[list.size()];
        String [] names = new String[list.size()];
        int i=0;
        for(PieImage pieImage:list){
            names[i] = pieImage.getName();
            values[i] = pieImage.getValue();
            i++;
        }
        maps.put("names",names);
        maps.put("valuess",values);
        return maps;
    }
}
