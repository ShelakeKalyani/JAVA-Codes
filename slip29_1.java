/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
 Write a method to search the customer name with given contact number and display the
 details.
Developed Date  : 12-12-2022 
Technology Used : JAVA 
*/


import java.util.*;
class customer
{

 int custno;
 String custname;
 String contact;
 String custaddr;
 customer(int custno,String custname,String contact,String custaddr)
 {
  this.custno=custno;
  this.custname=custname;
  this.contact=contact;
  this.custaddr= custaddr;
 
 }
 void search(String concact)
 {
    if(concact.equals(contact))
    
    {
    System.out.println();
       System.out.println("Contact is found ...below are the contact details \n");
       System.out.println(" name :"+custname+"  id:"+custno+"  concat:"+contact+"  address:"+custaddr);
    }
    else
    System.out.println("Contact number not found ");
 
 }
 void Display()
 {
       
          System.out.println("  name :"+custname+"  id:"+custno+"  concat:"+contact+"  address:"+custaddr);
 }
 
}
class slip29_1
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter how many number :");
  int n = sc.nextInt();
  customer []obj = new customer[n];
  for(int i=0;i<n;i++)
  {
  System.out.println();
  System.out.print("Enter Custno:");
  int no= sc.nextInt();
  sc.nextLine();
  System.out.print("Enter custname :");
  String name=sc.nextLine();
  
  System.out.print("Enter contact:");
  String contact = sc.nextLine();
  
  System.out.print("Enter address :");
  String addr = sc.nextLine();
  
   obj[i] = new customer(no,name,contact,addr);
  }
   
    System.out.println();
   for(int i=0;i<n;i++)
   {
      obj[i].Display();
   }
   System.out.println();
   System.out.print("Entre contact to search name :");
   String con = sc.nextLine();
   for(int i=0;i<1;i++)
   {
    obj[i].search(con);
    }
 }

}