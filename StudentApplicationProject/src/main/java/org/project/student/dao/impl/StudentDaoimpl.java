package org.project.student.dao.impl;

import java.util.List;

import org.project.student.dao.StudentDao;
import org.project.student.extractor.StudentExtractor;
import org.project.student.extractor.StudentListExtractor;
import org.project.student.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoimpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	private StudentListExtractor studentListExtractor;
	private StudentExtractor studentExtractor;
	
	public StudentDaoimpl(JdbcTemplate jdbcTemplate, StudentListExtractor studentListExtractor,
			StudentExtractor studentExtractor) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.studentListExtractor = studentListExtractor;
		this.studentExtractor = studentExtractor;
	}



	@Override
	public List<Student> getStudentList() {
		List<Student> studList=jdbcTemplate.query("select * from student", studentListExtractor::extractData);
		return studList;
	}



	@Override
	public Student getStudentById(int sid) {
		Student stud=jdbcTemplate.query("select * from student where sid="+ sid, studentExtractor::extractData);
		return stud;
	}



	@Override
	public void insertStudent(Student student) {
		String query="insert into student values("+student.getSid()+",'"+student.getSname()+"',"+student.getAge()+",'"+student.getAddress()+"','"+student.getCity()+"','"+student.getMobileNo()+"')";
		jdbcTemplate.update(query);
		
	}



	@Override
	public void updateStudent(Student student) {
		String query="update student set sname='"+student.getSname()+"',age ="+student.getAge()+",address='"+student.getAddress()+"', city='"+student.getCity()+"', mobileNo='"+student.getMobileNo()+"' where sid="+student.getSid();
		jdbcTemplate.update(query);
	}



	@Override
	public void deleteStudent(int sid) {
		String query="delete from student where sid="+sid ;
		jdbcTemplate.update(query);
		
		
	}
	 	

}
