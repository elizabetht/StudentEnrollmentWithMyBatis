package com.meygam.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.meygam.mappers.StudentMapper;
import com.meygam.model.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private SqlSession sqlSession;
	
	@Transactional
	public void insertStudent(Student student) {
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		studentMapper.insertStudent(student);
	}

	public boolean getStudentByLogin(String userName, String password) {
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = studentMapper.getStudentByUserName(userName);
		
		if(student != null && student.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}

	public boolean getStudentByUserName(String userName) {
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		Student student = studentMapper.getStudentByUserName(userName);
		
		if(student != null) {
			return true;
		}
		
		return false;
	}

}
