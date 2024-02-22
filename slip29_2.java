/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to create a super class Vehicle having members Company and price.
 Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle
 (capacity_in_tons). Accept the information for "n" vehicles and display the information in
 appropriate form. While taking data, ask user about the type of vehicle first.
Developed Date  : 29-12-2022 
Technology Used : JAVA 
*/


import java.util.*;
class vehicle
{
  String company;
  double price;
  vehicle(String company,double price)
  {
    this.company=company;
    this.price = price;
  }
}
class LightMotor extends vehicle
{
   int milege;
   LightMotor(String company,double price,int milege)
   {
      super(company,price);
      this.milege=milege;
   }
    void Display()
   {
     System.out.println("Comapany name :"+company);
     System.out.println("Comapany price :"+price);
     System.out.println("capacity:"+milege);
   
   }
  
}

class HeavyMotor extends vehicle
{
   int capacity;
   HeavyMotor( String company,double price,int capacity)
   {
      super(company,price);
      this.capacity=capacity;
   }
   void Display()
   {
     System.out.println("Comapany name :"+company);
     System.out.println("Comapany price :"+price);
     System.out.println("capacity:"+capacity);
   
   }

}
                                    
class slip29_2
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    while(true)
    {
    System.out.println("---------------------------MENU---------------------");
    System.out.println("1.Heavy motor vehicle");
    System.out.println("2.Light motor vehicle");
    System.out.println("3.Exit");
    System.out.println("-----------------------------------------------------\n");
    System.out.println("Enter choice :");
    int  ch = sc.nextInt();
    switch(ch)
    {
    
       case 1: 
             
              System.out.println("Enter how many heavy motor vehicle:");
              int n = sc.nextInt();
              HeavyMotor []obj = new HeavyMotor[n];
              for(int i=0;i<n;i++)
              {
              System.out.println();
                sc.nextLine();
                System.out.println("Enter company :");
                String cmp = sc.nextLine();
                
                System.out.println("Enter price:");
                double pri = sc.nextDouble();
                
                System.out.println("Enter capacity :");
                int capacity = sc.nextInt();
                
                obj[i]=new HeavyMotor(cmp,pri,capacity);
                
              }
              System.out.println();
              System.out.println("heavy motor vehicle details \n");
              for(int i=0;i<n;i++)
              {
                 obj[i].Display();
              }
             break;
       case 2:
               
              System.out.println("Enter how many light motor vehicle:");
              int n1 = sc.nextInt();
              LightMotor []obj1 = new LightMotor[n1];
              for(int i=0;i<n1;i++)
              {
              System.out.println();
              sc.nextLine();
                System.out.println("Enter company :");
                String cmp = sc.nextLine();
                
                System.out.println("Enter price:");
                double pri = sc.nextDouble();
                
                System.out.println("Enter milege :");
                int milege = sc.nextInt();
                
                obj1[i]=new LightMotor(cmp,pri,milege);
                
              }
              System.out.println();
              System.out.println("light motor vehicle details \n");
              for(int i=0;i<n1;i++)
              {
                 obj1[i].Display();
              }
       
            break;
            case 3:
                  return ;
       default:
             System.out.println("Invalid input");
    }
 }
 }

}