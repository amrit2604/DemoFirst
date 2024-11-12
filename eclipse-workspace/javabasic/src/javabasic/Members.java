package javabasic;

public class Members 
{
String emp_name;
int emp_id;
double salary;
public Members(String emp_name, int emp_id, double salary)
{
	this.emp_name=emp_name;
	this.emp_id=emp_id;
	this.salary=salary;
			
}
public void display()
{
	System.out.println("Employee Name : "+emp_name);
	System.out.println("Employee ID : "+emp_id);
	System.out.println("Employee Salary : "+salary);
}
public static void main(String[] args)
{
	Members m1=new Members("Bhumika", 167, 1000.0);
	m1.display();
}
}
