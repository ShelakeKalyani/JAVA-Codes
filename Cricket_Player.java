/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    :  Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
 Create an array of n player objects. Calculate the batting average for each player using static
 method avg(). Define a static sort method which sorts the array on the basis of average.
 Display the player details in sorted order.
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/


import java.util.*;
class CricketPlayer
{
 String name ;
 int no_of_innings,no_of_times_notout,totalruns;
 double bat_avg;
 public CricketPlayer(String name ,int no_of_innings,int no_of_times_notout,int totalruns)
 {
  this.name = name;
  this.no_of_innings=no_of_innings;
  this.no_of_times_notout=no_of_times_notout;
  this.totalruns=totalruns;
 }
 static void avg( int n,CricketPlayer obj[])
 {
    for(int i=0;i<n;i++)
    {
      obj[i].bat_avg=obj[i].totalruns/obj[i].no_of_innings;
    }
 
 }
 static void sortPlayer(int n,CricketPlayer obj[])
 {
   for(int i=0;i<n-1;i++)
     {
           for(int j=i+1;j<n;j++)
           {
             if(obj[i].bat_avg < obj[j].bat_avg)
             {
              CricketPlayer temp = obj[i];
                obj[i] = obj[j];
                obj[j] = temp;
             }
           }
     }
     System.out.println();
      
 
 }
 
 void Display()
 {
 System.out.println();
   System.out.println("name "+name);
   System.out.println("Total innings :"+no_of_innings);
    System.out.println("Not out :"+no_of_times_notout);
     System.out.println("Total runs :"+totalruns);
      System.out.println("bat average :"+bat_avg);
 }
 
 

}
class Cricket_Player
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many player :");
    int n = sc.nextInt();
    CricketPlayer []obj = new CricketPlayer[n];
    for(int i=0;i<n;i++)
    {
    System.out.println();
    System.out.println("Enter information of "+(i+1)+" Player");
    sc.nextLine();
       System.out.print("Enter Player name :");
       String name = sc.nextLine();
       
       System.out.print("Enter number of innings :");
       int no_of_innings = sc.nextInt();
       
     System.out.print("Enter number of times not out");
       int no_of_times_notout = sc.nextInt();
       
        System.out.print("Enter total runs :");
       int totalruns = sc.nextInt();
    
       obj[i]=new CricketPlayer(name,no_of_innings ,no_of_times_notout,totalruns );
    }
    CricketPlayer.avg(n,obj);
    System.out.println();
      System.out.println("Date after Sorting on basis of batting average");
     CricketPlayer.sortPlayer(n,obj);
     
     for(int i=0;i<n;i++)
      {
            obj[i].Display();
    }
   
     
  }

}
