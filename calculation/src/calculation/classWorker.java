package calculation;
import java.util.Scanner;
import java.text.NumberFormat;
public class classWorker {
	public
	String  name,gender,workertype,kra;
	int id,age;
	int choice;
	String workerid;
	int salary;
	Scanner keyboard=new Scanner(System .in);
	NumberFormat marvel=NumberFormat.getInstance();
public void personnaldet()
{
	System.out.println("You are adding a new worker:");
System.out.println("SECTION 1:PERSONAL DETAILS:");
	System.out.print("name:");
	name=keyboard.nextLine();
	System.out.print("id :");
	id=keyboard.nextInt();
	System.out.print("age:");
	age=keyboard.nextInt();
	System.out.print("kra:");
	kra=keyboard.next();
	System.out.println("gender:");
	System.out.println("1.Male"+"\n"+"2.Female");
	do
	{
		
	System.out.print("Enter choice:");
	choice=keyboard.nextInt();
	switch(choice)
	{
	case 1:
	{
		System.out.println("gender is male");
		break;
	}
	case 2:
	{
		System.out.println("gender is female");
		break;
	}
	default:
		System.out.println("Error!!!!invalid choice");
	}}
	while(choice <1||choice>2);
	
	
	

	}
public void employmentdet()
{
	System.out.println("\n"+"\n"+"SECTION 2:EMPLOYMENT DETAILS:");
	System.out.print("workerid:");
	workerid=keyboard.next();
	System.out.print("salary:");
	salary=keyboard.nextInt();
	System.out.println("workertype:");
	System.out.println("1.Fixed"+"\n"+"2.Helper");
	do
	{
		System.out.print("enter choice:");
		choice=keyboard.nextInt();
		switch(choice)
		{
		case 1:
		{
		System.out.println("Fixed worker.");
		break;
		}
		case 2:
		{
			System.out.println("helper");
			break;
		}
		default:
			System.out.println("invalid choice");
		}}
	while(choice <1||choice>2);
}
public void alldet()
{
	System.out.println("CONGRATULATIONS! You have succesfully added a new worker!");
	System.out.println("\n"+"\n"+"PERSONNAL DETAILS:");
	System.out.println("NAME"+"\t"+"\t"+"ID"+"\t"+"AGE"+"\t"+"KRA"+"\t"+"\t"+"\t"+"\t"+"GENDER");
	System.out.print(name.toUpperCase()+"\t"+"\t"+id+"\t"+"\t"+age+"\t"+"\t"+kra.toUpperCase()+"\t"+"\t"+"\t");
	switch(choice)
	{
	case 1:
	{
		System.out.println("MALE");
		break;
	}
	case 2:
	{
		System.out.println("FEMALE");
		break;
	}

	}
	System.out.println("\n"+"\n"+"EMPLOYMENT DETAILS:");
	System.out.println("WORKER ID"+"\t"+"\t"+"\t"+"SALARY"+"\t"+"\t"+"\t"+"WORKER TYPE"+"\t"+"\t");
	System.out.print(workerid.toUpperCase()+"\t"+"\t"+"\t"+"kshs."+marvel.format(salary)+"\t"+"\t");
	switch(choice)
	{
	case 1:
	{
	System.out.println("Fixed worker.");
	break;
	}
	case 2:
	{
		System.out.println("helper");
		break;
	}
}
}
}
