import java.util.*;
public class Student_Static{
	static class Stu_info{
		String name;
		int id;
		static String clgName="DKTE";

		Stu_info(){
			name="";
			id=0;
			clgName="DKTE";
		}
		Stu_info(String name,int id){
			this.name=name;
			this.id=id;
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
                
		Stu_info s1=new Stu_info(name1,id1);
		s1.display();		
		sc.close();	
	}
}