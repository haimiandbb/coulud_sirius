package com.cloud.sirius.demo.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "demo")
public class Demo {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 键
     */
    @Column(name = "dic_key")
    private String dicKey;

    /**
     * 值
     */
    @Column(name = "dic_value")
    private String dicValue;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}