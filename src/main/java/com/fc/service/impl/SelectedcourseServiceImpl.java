package com.fc.service.impl;

import com.fc.dao.SelectedcourseMapper;
import com.fc.entity.Selectedcourse;
import com.fc.entity.SelectedcourseExample;
import com.fc.service.SelectedcourseService;
import com.fc.vo.SelectedcourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SelectedcourseServiceImpl implements SelectedcourseService {
    @Autowired
    SelectedcourseMapper selectedcourseMapper;

    @Override
    public void update(Integer studentid, Integer courseid, String name, Integer mark) {
        SelectedcourseExample selectedcourseExample = new SelectedcourseExample();
        Selectedcourse selectedcourse = new Selectedcourse();
        selectedcourse.setCourseid(courseid);
        selectedcourse.setStudentid(studentid);
        selectedcourse.setMark(mark);
        SelectedcourseExample.Criteria criteria = selectedcourseExample.createCriteria();
        criteria.andCourseidEqualTo(courseid);
        criteria.andStudentidEqualTo(studentid);
        selectedcourseMapper.updateByExampleSelective(selectedcourse,selectedcourseExample);
    }
}