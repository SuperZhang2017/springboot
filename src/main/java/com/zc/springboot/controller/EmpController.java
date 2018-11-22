package com.zc.springboot.controller;

import com.zc.springboot.mapper.EmpMapper;
import com.zc.springboot.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/emp")
@Controller
public class EmpController {
    @Autowired
    protected EmpMapper empMapper;

    public EmpMapper getEmpMapper() {
        return empMapper;
    }

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @RequestMapping("/listEmp")
    public String listEmp(Model model){

        List<Emp> emps = empMapper.findAll();

        model.addAttribute("emps",emps);
        //System.out.println("122211");
        return "listEmp";

    }

}
