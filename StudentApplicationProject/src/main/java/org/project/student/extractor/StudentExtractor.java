package org.project.student.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.project.student.model.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
@Component
public class StudentExtractor implements ResultSetExtractor<Student> {

	@Override
	public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
		Student stud=new Student();
		if(rs.next()) {
			stud.setSid(rs.getInt("sid"));
			stud.setSname(rs.getString("sname"));
			stud.setAge(rs.getInt("age"));
			stud.setAddress(rs.getString("address"));
			stud.setCity(rs.getString("city"));
			stud.setMobileNo(rs.getString("mobileNo"));
		}
		return stud;
	}

}
