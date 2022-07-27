package com.abc.Factory;

import com.abc.persistence.IStudentDao;
import com.abc.persistence.StudentDaoImpl;

public class StudentDAOFactory
{
	private static IStudentDao studentDao;
	static
	{
		studentDao=new StudentDaoImpl();
	}
	public static IStudentDao getDao()
	{
		return studentDao;
	}

}
