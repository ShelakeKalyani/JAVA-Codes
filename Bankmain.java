
/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 and 
 Rs.200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
 are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method 
 by creating an object of each of the three classes
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/

 
abstract class bank
{
 abstract void getBalance();
}
class bankA extends bank
{
 void getBalance()
 {
 System.out.println("Bank A\nBalance: "+100);
 }
 
}
class bankB extends bank
{
 void getBalance()
 {
 System.out.println("Bank B\nBalance: "+150);
 }
}
class bankC extends bank
{
 void getBalance()
 {
 System.out.println("Bank C\nBalance: "+200);
 }
}
public class Bankmain 
{
 public static void main(String[] args) 
 {
 bankA a=new bankA();
 a.getBalance();
 bankB b=new bankB();
 b.getBalance();
 bankC c=new bankC();
 c.getBalance();
 }
}