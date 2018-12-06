package com.bdxmx.miniprogram.mapper;

import org.mybatis.extend.generic.mapper.GenericMapper;

import com.bdxmx.miniprogram.model.Teacher;

/**
 * Mapper: TeacherMapper
 * Model : Teacher
 * Table : teachers
 *
 * This Mapper generated by MyBatis Generator Extend at 2018-12-04 10:26:51
 */
public interface TeacherMapper extends GenericMapper<Teacher, Integer> {
    Teacher findTeacherByAccessToken(String userToken);
}