package this_keyprgms;

public class this_keyword_prgms
{
int age=0;
String name;
double salary;
void student_details(int age,String name,double salary)
{
	this.age=age;
	this.name=name;
	this.salary=salary;
}
public static void main(String[] args) 
{
	this_keyword_prgms s1=new  ThisKeyword;
	s1.student_details(45,"kamal", 7872);
	System.out.println(s1.salary);
	System.out.println(s1.name);
	System.out.println(s1.age);
}
}
