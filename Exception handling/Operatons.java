import java.util.*;
class public Except extend Exception{
	public Except(String msg){
		super(msg);
	}
}
class public Operatons{
	public float num1;
	public float num2;
	public Operatons(float num1,float num2){
		this.num1=num1;
		this.num2-num2;
	}
	public float add(float num1,float num2) throws Except{
		float re=num1+num2;
		if(re>1000){
			throw new Except("Addition above 1000!!!");
		}
		return re;
	}
	public float sub(float num1,float num2) throws Except{
		float re=num1num2;
		if(re<0){
			throw new Except("Substraction is negative!!!");
		}
		return re;
	}
	public float div(float num1,float num2) throws Except{
		if(num2==0){
			throw new Except("Division by zero not possible");
		}
		return (float)num1/num2;
	}
	public float mul(float num1,float num2) throws Except{
		float re=num1*num2;
		if(re>5000){
			throw new Except("Multi is above 5000");
		}
		return re;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(Syatem.in);
		while(true){
			System.out.println("1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
			System.out.println("Enter Operation to perform operation(1-4):");
			int ch=sc.nextInt();
			
			if (ch == 5) {
                		break; // Exit the loop
            		}

            		System.out.print("Enter two numbers: ");
            		float num1 = sc.nextFloat();
            		float num2 = sc.nextFloat();
            		Operations operations = new Operations(num1, num2);

            		try {
                		switch (ch) {
                    			case 1:
                       				System.out.println("The Addition is: " + operations.add());
                        			break;
                    			case 2:
                       				System.out.println("The Subtraction is: " + operations.sub());
                        			break;
                    			case 3:
                        			System.out.println("The Multiplication is: " + operations.mul());
                        			break;
                    			case 4:
                        			System.out.println("The Division is: " + operations.div());
                        			break;
                    			default:
                        			System.out.println("Invalid operation. Please choose between 1 and 5.");
                		}
            		} catch (Except e) {
                		System.out.println(e.getMessage());
            		}
		}
		sc.close();		
	}
}