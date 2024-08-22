class Counter{
	int cnt=0;

	Counter(){
		cnt++;
		System.out.print("Count :"+cnt);
	}
	public static void main(String[] args){
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();

	}
}
