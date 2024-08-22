import java.util.*;
public class Student{
	static class Stu_info{
		String name;
		int id;
		static String clgName;

		Stu_info(){
			name="";
			id=0;
			clgName="";
		}
		Stu_info(String name,int id,String clgName){
			this.name=name;
			this.id=id;
			this.clgName=clgName;
		}
		void display(){
			System.out.print("Name :"+name+"\n"+"ID :"+id+"\n"+"College name :"+clgName);	
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name:");
		String name1=sc.nextLine();

		System.out.print("Enter the id:");
		int id1=sc.nextInt();

		System.out.print("Enter the college name:");
		String clgName1=sc.next();
	
                
		Stu_info s1=new Stu_info(name1,id1,clgName1);
		s1.display();

		System.out.print("Enter the name:");
		String name=sc.nextLine();

		System.out.print("Enter the id:");
		int id=sc.nextInt();

		System.out.print("Enter the college name:");
		String clgName=sc.next();
	
		Stu_info s2=new Stu_info(name,id,clgName);
		s2.display();
		
		System.out.print("Enter the name:");
		String name=sc.nextLine();

		System.out.print("Enter the id:");
		int id=sc.nextInt();

		System.out.print("Enter the college name:");
		String clgName=sc.next();
	
		Stu_info s3=new Stu_info(name,id,clgName);
		s3.display();
		
		sc.close();	
	}
}