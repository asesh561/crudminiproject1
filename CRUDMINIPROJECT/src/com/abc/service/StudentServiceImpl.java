package com.abc.service;

import com.abc.Factory.StudentDAOFactory;
import com.abc.POJO.Student;
import com.abc.persistence.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	@Override
	public String save(Student student) {
		IStudentDao dao = StudentDAOFactory.getDao();
		return dao.save(student);
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
