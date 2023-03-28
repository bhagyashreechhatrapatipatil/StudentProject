package org.project.student.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.project.student.model.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
@Component
public class StudentListExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		ArrayList<Student> studList=new ArrayList<Student>();
		Student stud=null;
		while(rs.next()) {
			stud=new Student();
			stud.setSid(rs.getInt("sid"));
			stud.setSname(rs.getString("sname"));
			stud.setAge(rs.getInt("age"));
			stud.setAddress(rs.getString("address"));
			stud.setCity(rs.getString("city"));
			stud.setMobileNo(rs.getString("mobileNo"));
			studList.add(stud);
		}
		return studList;
	}

}
