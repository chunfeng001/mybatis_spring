package com.hniu;

import com.hniu.mapper.StudentMapper;
import com.hniu.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
        StudentMapper studentMapper = ac.getBean(StudentMapper.class);
//        Map<String,Object> map=new HashMap<>();
//////        map.put("name","张三");
//////        map.put("age",18);
        Student stu=new Student();
        stu.setName("张三");
         studentMapper.update(stu);
    }
}
