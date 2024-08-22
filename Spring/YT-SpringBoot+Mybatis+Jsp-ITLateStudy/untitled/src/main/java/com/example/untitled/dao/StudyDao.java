package com.example.untitled.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudyDao {

    public List<Map<String, String>> doStudyList();
}
