package pack;

public class Arithmatic{
	public static float add(float a,float b){
		return a+b;
	}
	public static float sub(float a,float b){
		return a-b;
	}
	public static float mul(float a,float b){
		return a*b;
	}
	public static float div(float a,float b){
		if(b==0){
			return -1;
		}
		else{
			return a/b;
		}
	}
}
