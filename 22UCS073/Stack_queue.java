interface Operation{
	void push(int data);
	int pop();
	void enqueue(int data);
	int dequeue();
	void display();
		
}
class Stack implements Operation{
	private int[] stackArray;
	private top;
	private capacity;
	
	public Stack(int size){
		stackArray = new int[size];
        	top = -1;
        	capacity = size;
	}
	public void push(int data){
		if(top==capacity-1){
			System.out.print("Stack is Full!");
		}
		else{
			stackArray[++top]=data;
		}
	}
	public int pop(){
		if(top==-1){
			System.out.print("Stack is empty!");
		}
		else{
			return stackArray[top--];
		}
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(stackArray[i]+" ");
		}
	}
}
class Queue implements Operation{
	private int[] queueArray;
    	private int front, rear, size, capacity;
	
	public Queue(int size){
		queueArray=new int[size];
		front=-1;
		rear=-1;
		capacity=size;
	}
	public void enqueue(int data){
		if(size==capacity){
			System.out.print("Queue is Full");
		}
		else{
			rear=(rear+1)%capacity;
			queueArray[rear]=data;
			size++;
		}
	}
	public int dequeue(){
		if(size==0){
			System.out.print("Queue is Empty");
		}
		else{
			int data=queueArray[front];
			front=(front+1)%capacity;
			size--;
			return data;
		}
	}
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(queueArray[(front+1)%capacity)+" ");
		}
	}
}
public class Stack_queue{
	public static void main(String[] args){
		
	}
}