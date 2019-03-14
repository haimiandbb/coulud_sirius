package com.cloud.sirius.demo.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author xu.guanguo
 * @time 2019/3/8
 * @description
 */
@Data
public class DemoVo {
    private Long id;
    private String dicKey;
    private String dicValue;
    private Date createTime;
    private Date updateTime;
}
