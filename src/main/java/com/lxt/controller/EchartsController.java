package com.lxt.controller;

import com.lxt.service.EchartsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by 李啸天 on 2018/11/14.
 */
@RestController
@Slf4j
@RequestMapping("/echarts")
public class EchartsController {

    @Autowired
    private EchartsService echartsService;


    /**
     * 查询出所有柱状图的数据
     * @return
     */
    @RequestMapping("/queryBarGraphList")
    public Map<String,Object> queryBarGraphList(){
        return echartsService.queryBarGraphList();
    }

    /**
     * 查询出所有扇形图的数据
     * @return
     */
    @RequestMapping("/queryPieImageList")
    public Map<String, Object> queryPieImageList() {
        return echartsService.queryPieImageList();
    }
}
