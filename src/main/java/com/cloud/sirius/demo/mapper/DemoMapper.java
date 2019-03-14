package com.cloud.sirius.demo.mapper;

import com.cloud.sirius.demo.entity.Demo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DemoMapper extends Mapper<Demo> {
     Demo queryDemo(@Param("dicKey") String dicKey);
}