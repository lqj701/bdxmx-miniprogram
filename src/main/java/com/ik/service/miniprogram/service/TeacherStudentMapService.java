package com.ik.service.miniprogram.service;

import java.util.List;

import org.mybatis.extend.generic.service.GenericService;

import com.ik.service.miniprogram.model.TeacherStudentMap;

/**
 * Service: TeacherStudentMapService
 * Mapper : TeacherStudentMapMapper
 * Model  : TeacherStudentMap
 *
 * This Service generated by MyBatis Generator Extend at 2018-12-04 10:26:51
 */
public interface TeacherStudentMapService extends GenericService<TeacherStudentMap, Integer> {
    void saveStudentTeacherMap(Integer studentId, List<Integer> teacherIds);
}