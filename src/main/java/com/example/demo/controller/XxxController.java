package com.example.demo.controller;

import javax.annotation.Resource;

import com.example.demo.dao.XxxDAO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Xxx")
public class XxxController{


    @Resource
    XxxDAO xxxDAO;

    @RequestMapping("/list")
    public String xlist(Model model)
    {
        model.addAttribute("msg", "222");

        model.addAttribute("xxxs", xxxDAO.selectAll());

        return "XXX/list";
    }
}