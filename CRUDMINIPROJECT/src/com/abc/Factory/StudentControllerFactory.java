package com.abc.Factory;

import com.abc.Controller.IStudentController;
import com.abc.Controller.StudentControllerImpl;
//factory design pattern code
public class StudentControllerFactory 
{
	private static IStudentController studentController;
	static
	{
		//interface type reference assigned to child class object
		//loose coupling
		studentController=new StudentControllerImpl();
	}
	public static IStudentController getStudentController()
	{
		return studentController;
	}

}
