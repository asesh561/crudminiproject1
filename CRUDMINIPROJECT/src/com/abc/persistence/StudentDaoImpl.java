package com.abc.persistence;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.abc.POJO.Student;
import com.abc.utility.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public String save(Student student)  
	{
		Connection connection=null;
		PreparedStatement pstmt=null;
		try
		{
			connection = JdbcUtil.getDBConnection();
			if(connection!=null)
			{
				String SQL_INSERT_QUERY="INSERT INTO STUDENT(SID,SNAME,SAGE,SADDRESS)VALUES(?,?,?)";
				pstmt=connection.prepareStatement(SQL_INSERT_QUERY);
				if(pstmt!=null)
				{
					pstmt.setString(2,student.getSname());
					pstmt.setInt(3, student.getSage());
					pstmt.setString(4, student.getSaddress());
					int rowCount = pstmt.executeUpdate();
					if(rowCount>0)
					{
						return "record Inserted Successfully....";
					}
				}
			}
		}
		catch (SQLException | IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			JdbcUtil.close(null, pstmt, connection);
		}
		return "record insertion failed try again....";
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
