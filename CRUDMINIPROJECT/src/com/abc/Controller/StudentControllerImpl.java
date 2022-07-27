package com.abc.Controller;

import com.abc.Factory.StudentServiceFactory;
import com.abc.POJO.Student;
import com.abc.service.IStudentService;

public class StudentControllerImpl implements IStudentController {

	@Override
	public String save(Student student)
	{
		IStudentService studentService = StudentServiceFactory.getStudentService();
		return studentService.save(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
