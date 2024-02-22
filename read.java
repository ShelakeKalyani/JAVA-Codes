/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program that reads on file name from the user, then displays information about 
 whether the file exists, whether the file is readable, whether the file is writable, the type of 
 file and the length of the file in bytes.
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/

 
 
import java.io.*;
import java.util.Scanner;
public class Read 
{
 
 public static void main(String[] args) 
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter File Name:");
 String f=sc.nextLine();
 File f1=new File(f);
 if(f1.exists())
 {
     System.out.println("Exist");
    if(f1.canRead())
    {
      System.out.println("Readable");
    }
	else
	{
	  System.out.println("Not readable");
	}
	
	if(f1.canWrite())
	{
		System.out.println("Writable");
	}
	else
	{
	     System.out.println("Not writable");
	}
	
	 String e=f1.toString();
	 int index=e.lastIndexOf('.');
	 if(index>0)
	 {
	 e=e.substring(index);
	 System.out.println("File Type: "+e);
	 }
	 System.out.println("File Size: "+f1.length()+" bytes");
 }
 else
 {
 System.out.println("Naah");
 }
 }
}
