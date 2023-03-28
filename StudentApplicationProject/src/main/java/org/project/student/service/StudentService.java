package org.project.student.service;

import java.util.List;

import org.project.student.model.Student;

public interface StudentService {

	List<Student> getStudentServiceList();

	Student getStudentByIdServiceList(int sid);

	void insertStudentServiceList(Student student);

	void updateStudentService(Student student);

	void deleteStudService(int sid);

	

}
