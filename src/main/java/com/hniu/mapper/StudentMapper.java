package com.hniu.mapper;

import com.hniu.pojo.Student;
import org.springframework.stereotype.Repository;

import java.rmi.StubNotFoundException;
import java.util.List;
import java.util.Map;

@Repository
public interface StudentMapper {

    List<Student> list(Map<String,Object> map);

    int update(Student student);

    int save(Student student);

    int delete(Integer[] ids);

}
