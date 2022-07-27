package com.abc.Controller;

import com.abc.POJO.Student;

public interface IStudentController
{
	public String save(Student student);
	
	public Student getById(int id);
	
	public String updateById(Student student);
	
	public String deleteById(int id);
	
	

}
