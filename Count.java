/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a program to accept a file name from command prompt, if the file exits then display number of words and lines in that file.
Developed Date  : 27-12-2022 
Technology Used : JAVA 
*/

import java.io.*;
import java.util.Scanner;
public class Count 
{
  public static void main(String[] args) throws IOException 
  {
  String line;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter file:");
  String f1=sc.nextLine();
  FileReader r=new FileReader(f1);
  BufferedReader b=new BufferedReader(r);
  int count=0;
  while((line=b.readLine())!=null)
 {
  String words[]=line.split(" ");
  count=count+words.length;
 }
  System.out.println("No.of Words:"+count);
 }
}