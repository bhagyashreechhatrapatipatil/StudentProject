package org.project.student.service.impl;

import java.util.List;

import org.project.student.dao.StudentDao;
import org.project.student.model.Student;
import org.project.student.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
   private StudentDao studentDao;
   
	public StudentServiceImpl(StudentDao studentDao) {
	super();
	this.studentDao = studentDao;
}

	@Override
	public List<Student> getStudentServiceList() {
		List<Student> slist=studentDao.getStudentList();
		return slist;
	}

	@Override
	public Student getStudentByIdServiceList(int sid) {
		Student studlist=studentDao.getStudentById(sid);
		return studlist;
	}

	@Override
	public void insertStudentServiceList(Student student) {
		studentDao.insertStudent(student);
		
	}

	@Override
	public void updateStudentService(Student student) {
		studentDao.updateStudent(student);
		
	}

	@Override
	public void deleteStudService(int sid) {
		studentDao.deleteStudent(sid);
		
	}

}
