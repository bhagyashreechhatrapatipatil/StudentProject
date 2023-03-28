package org.project.student.dao;

import java.util.List;

import org.project.student.model.Student;

public interface StudentDao {

	List<Student> getStudentList();

	Student getStudentById(int sid);

	void insertStudent(Student student);

	void updateStudent(Student student);

	void deleteStudent(int sid);

}
