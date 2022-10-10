import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException
	{
		
		System.out.println("welcome to project student management app");
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO EXIT APP");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				//add student
				System.out.println("enter user name:");
				String name=br.readLine();
				System.out.println("enter user phone:");
				String phone=br.readLine();
				System.out.println("enter user city :");
				String city=br.readLine();
				//create student object to store student
				Student st=new Student(name,phone,city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("student added successfully....");
				}
				else {
					System.out.println("something went wrong....try again.....");
				}
				System.out.println(st);
			}
			else if(c==2)
			{
				System.out.println("enter the student id to delete :");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("deleted....");
				}
				else
				{
					System.out.println("something went wrong....");
				}
				//delete student
			}
			else if(c==3)
			{
				//display student
				StudentDao.showAllStudent();
				
			}
			else if(c==4)
			{
				break;
			}
			else
			{
				
			}
				
			
			
				
			}
		System.out.println("thank you using my application");
		System.out.println("see you soon");
			
			
			
	
	
	}

}
