/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Create a class Student(rollno, name ,class, per), to read student information from the console 
 and display them (Using BufferedReader class)
Developed Date  : 22-12-2022 
Technology Used : JAVA 
*/

 
 
 
import java.io.*;
public class Buffer 
{
 
 public static void main(String[] args) throws IOException 
 {
 BufferedReader sc= new BufferedReader (new InputStreamReader(System.in));
 System.out.println("Enter Name");
 String name=sc.readLine();
 System.out.println("Enter rollno");
 int rollno= Integer.parseInt(sc.readLine());
 System.out.println("Enter Class");
 String c = sc.readLine(); 
 System.out.println("Enter Percentage");
 float per=Float.parseFloat(sc.readLine());
 System.out.println(name+" "+rollno+" "+c+" "+per+"%");
 }
}
