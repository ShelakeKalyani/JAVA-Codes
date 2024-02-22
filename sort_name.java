/*
7th) : - 
Write a program to accept n names of country and display them in descending order.
*/

import java.io.*;
  
class sort_name
{
    public static void main(String args[])throws IOException
    {
        String temp;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print("Enter the value of N: ");
        int n=Integer.parseInt(br.readLine());
        
         
        String names[] = new String[n];
             
        System.out.println("Enter names: ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter name [ " + (i+1) +" ]: ");
            names[i] = br.readLine();
        }
             
        //sorting strings 
         
        for(int i=0; i<n; i++)
        {
            for(int j=1; j<n; j++)
            {
                if(names[j-1].compareTo(names[j])<0)   //for ascending >0
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;
                }
            }
        }
         
         
        System.out.println("\nSorted names are in Descending Order: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}