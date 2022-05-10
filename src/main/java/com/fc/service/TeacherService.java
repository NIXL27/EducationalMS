package com.fc.service;

import com.fc.entity.Course;
import com.fc.entity.Teacher;
import com.fc.vo.SelectedcourseVo;

import java.util.List;

public interface TeacherService {
    // 根据用户名查询教师信息
    List<Course> showCourse(String username);

    SelectedcourseVo finOne(Integer studentid, Integer courseid);

    // 查询全部教师
    List<Teacher> findAll();
}
