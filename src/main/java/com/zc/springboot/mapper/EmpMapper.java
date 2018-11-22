package com.zc.springboot.mapper;

import com.zc.springboot.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface EmpMapper {

    @Select("select * from emp")
    List<Emp> findAll();


}
