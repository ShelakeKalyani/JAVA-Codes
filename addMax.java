/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a package for Operation, which has two classes, Addition and Maximum. Addition has
two methods add () and subtract (), which are used to add two integers and subtract two,
float values respectively. Maximum has a method max () to display the maximum of two
integers
Developed Date  : 10-12-2022 
Technology Used : JAVA 
*/


import Operation.*;
import java.util.*;

public class addMax
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int a,b;
	   float c,d;
	   
	   System.out.println("Enter two integer numbers = ");
	   a = sc.nextInt();
	   b = sc.nextInt();
	   
	   Addition obj = new Addition();
	   obj.add(a,b);
	   
	   Maximum obj1 = new Maximum();
	   obj1.max(a,b);
	   
	   System.out.println("Enter two float numbers = ");
	   c = sc.nextFloat();
	   d = sc.nextFloat();
	   
	   obj.subtract(c,d);
   }
}