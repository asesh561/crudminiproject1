package com.abc.Main;

import java.util.Scanner;

import com.abc.Controller.IStudentController;
import com.abc.Factory.StudentControllerFactory;
import com.abc.POJO.Student;

public class AppMain 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String sid,name = null,age = null,address=null;
		while(true)
		{
			System.out.println("Welcome to our Student Application");
			System.out.println("press 1.Create a student record");
			System.out.println("press 2.View a student record");
			System.out.println("press 3.update a student record");
			System.out.println("press 4. Delete a student record");
			System.out.println("Press 5. Exit");
			System.out.println("Enter your choice: ");
			int option = scan.nextInt();
			switch(option)
			{
			case 1://collecting inputs
				System.out.println("Enter the student ID::");
				sid=scan.next();
				System.out.println("Enter the Student name::");
				scan.next();
				System.out.println("Enter the Student age::");
				scan.next();
				System.out.println("Enter the student Address:: ");
				scan.next();
				//sending the data to the controller using pojo
				Student student = new Student();
				student.setSid(Integer.parseInt(sid));
				student.setSname(name);
				student.setSage(Integer.parseInt(age));
				student.setSaddress(address);
				IStudentController studentController = StudentControllerFactory.getStudentController();
				String status = studentController.save(student);
				System.out.println(status);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:System.exit(0);
			break;
			default:System.out.println("Enter the valid choice");
			break;
			}
		}


	}

}
