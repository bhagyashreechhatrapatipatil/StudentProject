package org.project.student.controller;

import java.util.List;

import org.project.student.model.Student;
import org.project.student.service.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="students")
public class StudentController {
    private StudentService studentService;
    
    public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping
    public List<Student> getStudListCtrl(){
    	List<Student> studList=studentService.getStudentServiceList();
		return studList;
    	
    }
	@GetMapping("/{sname}")
	public  Student getStudentByIdCtrl(@PathVariable(value="sname") int sid) {
		Student stud=studentService.getStudentByIdServiceList(sid);
		return stud;
		
	}
	@PostMapping
	public void insertStudentList(@RequestBody Student student)
	{
	    studentService.insertStudentServiceList(student);
	}
	@PutMapping
	public void updateStudentCtrl(@RequestBody Student student) {
		studentService.updateStudentService(student);
	}
	
	@DeleteMapping("/{snum}")
	public void deleteStudCtrl(@PathVariable(value = "snum") int sid)
	{
		studentService.deleteStudService(sid);
	}
	
    
}
