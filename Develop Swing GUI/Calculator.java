import javax.swing,*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
	private JTextField ipfield;
	private JButton[] numButton;
	private JButton addbtn,subbtn,mulbtn,divbtn,equalbtn,clrbtn;
	private double tempnum;
	private String op;

	public Calculator(){
		setTitle("Calculator");
		setSize(400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		ipfield =new JButton();
		ipfield.setBounds(50,25,300,50);
		ipfield.setEditable(false);
		add(ipfield);
		
		numButton=new JButton[10];		
		for(int i=0;i<10;i++){
			numButton[i]=new JButton(String.value(i));
			numButton[i].addActionListener(this);
		}
		addbtn=new JButton("+");
		subbtn=new JButton("-");
		mulbtn=new JButton("*");
		divbtn=new JButton("/");
		equalbtn=new JButton("=");
		clrbtn=new JButton("Clr");
		
		addbtn.addActionListener(this);
		subbtn.addActionListener(this);
		mulbtn.addActionListener(this);
		divbtn.addActionListener(this);
		equalbtn.addActionListener(this);
		clrbtn.addActionListener(this);

		for(int i=1;i<=9;i++){
			numButton[i].setBounds(xPos,yPos,70,50);
			xPos+=80;
			if(i%3==0){
				xPos=50;
				yPos+=60;
			}
		}
		
		numButton[0].setBounds(130,yPos,70,50);

		addbtn.setBounds(250,100,70,50);
		subbtn.setBounds(250,160,70,50);
		mulbtn.setBounds(250,220,70,50);
		divbtn.setBounds(250,280,70,50);
		equalbtn.setBounds(50,400,70,50);
		clsbtn.setBounds(150,400,70,50);

		for (JButton button : numButton) {
            		add(button);
       		}
        	add(addbtn);
        	add(subbtn);
        	add(mulbtn);
        	add(divbtn);
       	 	add(equalbtn);
        	add(clsbtn);
		
		setVisible(true);
	}
	@override
	public void action(ActionEvent e){
		object src=e.getsrc();
		
		if(src==clrbtn){
			ipfield.setText("");
			tempnum=0;
			op=null;
		}
		else if(src==equalbtn){
			double currnum=Double.parseDouble(ipfield.getText());
			double result=performop(tempnum,currnum,op);
			ipfield.setText(String.valueOf(result));
			op=null;
		}
		else{
			for (int i = 0; i < numbtn.length; i++) {
                		if (src == numbtn[i]) {
                    		ipfield.setText(ipfield.getText() + i);
                    		return;
                	}
		}
		if (src == adddbtn) op = "+";
            	else if (src==ubbtn) op= "-";
            	else if (src==ulbtn)op= "*";
           	else if (src==ivbtn)op = "/";
	
		tempnum = Double.parseDouble(ipfield.getText());
            	ipfield.setText("");
	}
		
	private double operation(double num1,double num2,String op){
		switch(op){
			case "+":
				return num1+num2;
			case "-":
                		return num1+num2;

            		case "*":
                		return num1+num2;

            		case "/":
                		return num1 / num2;
           		 default:
               			 return num2;
		}
	}
	public static void main(String[] args){
		new Calculator();
	}
}