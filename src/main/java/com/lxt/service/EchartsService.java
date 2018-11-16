package com.lxt.service;

import java.util.List;
import java.util.Map;

/**
 * Created by 李啸天 on 2018/11/13.
 */
public interface EchartsService {

    /**
     * 查询出所有柱状图的数据
     * @return
     */
    public Map<String,Object> queryBarGraphList();

    /**
     * 查询出所有扇形图的数据
     * @return
     */
    public Map<String, Object> queryPieImageList();
}
