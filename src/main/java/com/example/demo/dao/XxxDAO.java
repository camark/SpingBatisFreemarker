package com.example.demo.dao;

import com.example.demo.mapper.Xxxx;
import org.apache.ibatis.annotations.Mapper;
import java.util.*;

@Mapper
public interface XxxDAO {
    public List<Xxxx> selectAll();
}