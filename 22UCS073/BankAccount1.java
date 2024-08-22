import util.lang.java;
class BankAccount1{
public static void main(Strings[] args)
{
Account a1= new Account();
Account a2= new Account('SBI2004','ram',550000);
a2.deposite(20000);
a2.withdrow(35000);
System.out.println("balance of default"+a1.balance);
System.out.println("Account number"+a2.accountNumber);
System.out.println("Account Name"+a2.accountHolderNam);
System.out.println("balance"+a2.balance);



}
}





class Account
{
private String accountNumber;
private String accountHolderName;
private double balance;

class Account()
{}

class Account(String accNumber,String accountName,double bal)
{
accountNumber=accNumber;
accountHolderName=accountName;
 balance=bal;
}

public deposite(double amount)
{
balance=balance+amount;
System.out.println("amount is deposited");
}

public withdrow(double amount)
{
if(balance<amount)
{
System.out.println("amount is unable to withdrow");
}
else{
balance=balance-amount;
System.out.println("amount is deposited");
System.out.println("amount is withdrowed");
}
}

String getAccountno()
{
return accountNumber;
}

String getAccountname()
{
return accountHolderName;
}

double getBalance()
{
return balance;
}

}



