package com.cloud.sirius.demo.service;

import com.cloud.sirius.demo.vo.DemoVo;

/**
 * @author xu.guanguo
 * @time 2019/3/13
 * @description
 */
public interface DemoService {
    void insertDemo(DemoVo demo);
    void updateDemo(DemoVo demo);
    void deleteDemo(DemoVo demo);
    DemoVo queryDemo(DemoVo demo);
}
