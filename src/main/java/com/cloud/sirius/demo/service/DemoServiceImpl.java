package com.cloud.sirius.demo.service;

import com.cloud.sirius.demo.entity.Demo;
import com.cloud.sirius.demo.mapper.DemoMapper;
import com.cloud.sirius.demo.vo.DemoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author xu.guanguo
 * @time 2019/3/13
 * @description
 */
@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    DemoMapper demoMapper;

    @Override
    public void insertDemo(DemoVo demo) {
        Demo demoEntity = new Demo();
        BeanUtils.copyProperties(demo,demoEntity);
        demoMapper.insertSelective(demoEntity);
    }

    @Override
    public void updateDemo(DemoVo demo) {
        Demo demoEntity = new Demo();
        BeanUtils.copyProperties(demo,demoEntity);
        demoEntity.setUpdateTime(new Date());
        demoMapper.updateByPrimaryKey(demoEntity);
    }

    @Override
    public void deleteDemo(DemoVo demo) {
        Demo demoEntity = new Demo();
        BeanUtils.copyProperties(demo,demoEntity);
        demoMapper.deleteByPrimaryKey(demoEntity);
    }

    @Override
    public DemoVo queryDemo(DemoVo demo) {
        DemoVo vo = new DemoVo();
        Demo demo1 = demoMapper.queryDemo(demo.getDicKey());
        BeanUtils.copyProperties(demo1,vo);
        return vo;
    }
}
