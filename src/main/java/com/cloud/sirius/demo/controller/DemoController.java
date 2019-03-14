package com.cloud.sirius.demo.controller;

import com.cloud.sirius.demo.service.DemoService;
import com.cloud.sirius.demo.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author hmdbb
 * @time 2019/3/11
 * @description
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @Autowired
    DemoService demoService;

    @RequestMapping("hello")
    public DemoVo helloword(String key, String value) {
        DemoVo demoVo = new DemoVo();
        demoVo.setDicKey(key);
        demoVo.setDicValue(value);
        demoVo.setCreateTime(new Date());
        demoService.insertDemo(demoVo);
        return demoVo;
    }

    @PostMapping("update")
    public DemoVo update(@RequestBody DemoVo demoVo) {
        demoVo.setUpdateTime(new Date());
        demoService.updateDemo(demoVo);
        return demoVo;
    }

    @PostMapping("delete")
    public DemoVo delete(@RequestBody DemoVo demoVo) {
        demoService.deleteDemo(demoVo);
        return demoVo;
    }

    @PostMapping("query")
    public DemoVo query(@RequestBody DemoVo demoVo) {
        return demoService.queryDemo(demoVo);
    }
}
