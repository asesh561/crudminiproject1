package com.abc.Factory;

import com.abc.Controller.IStudentController;
import com.abc.service.IStudentService;
import com.abc.service.StudentServiceImpl;

public class StudentServiceFactory 
{
	private static IStudentService studentService;
	static
	{
		//interface type reference assigned to child class object
		//loose coupling
		studentService=new StudentServiceImpl();
	}
	public static IStudentService getStudentService()
	{
		return studentService;
	}
}
