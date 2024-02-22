/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define a class patient(patient_name,Patient_age,Patient_oxy_level,Patient_HRCT_Report).Create an object of patient.          Handle appropriate exception while patient oxygen level less than 95% and HRCT scan report greater than 10, then throw user defined Exception "Patient is Covid Positive(+) and 
                  Need to be Hospitalized" otherwise display its information.
Developed Date  : 25-12-2022 
Technology Used : JAVA 
*/


import java.io.*;
import java.util.*;

class Patient
{
    String Patient_Name;
    int Patient_age,Patient_oxy_level,Patient_HRCT_Report;
    
    Patient(String name,int age,int oxy,int HRCT)
    {
        Patient_Name = name;
        Patient_age = age;
        Patient_oxy_level = oxy;
        Patient_HRCT_Report = HRCT;
    }

    public void Display()
    {
        System.out.println("Patient Name = "+Patient_Name);
        System.out.println("Patient age = "+Patient_age);
	System.out.println("Patient oxygen level = "+Patient_oxy_level);
        System.out.println("Patient HRCT Report = "+Patient_HRCT_Report);
    }
 
    int getOxy()
    {
	return Patient_oxy_level;
    }

    int getHRCT()
    {
        return Patient_HRCT_Report;
    }
}

class MyException extends Exception
{
	MyException(String s)
        {
    	    super(s);
        }
}


class Exceptioneg
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int age,oxy,hrct;
       String name;

       System.out.println("Enter Patient name,age,oxygen level and hrct = ");
       name = sc.next();
       age = sc.nextInt();
       oxy = sc.nextInt();
       hrct = sc.nextInt();

       Patient pobj = new Patient(name,age,oxy,hrct);

       try
       {
          if(pobj.getOxy()<95 && pobj.getHRCT()>10)
          {
               throw new MyException("Patient is covid positive and need to be hospitalized.");
          }
          else
          {
		pobj.Display();
          }
       }

       catch(MyException me)
       {
            System.out.println("Alert = "+me.getMessage());
            System.out.println("Patient Oxygen level = "+pobj.getOxy());
	    System.out.println("Patient Oxygen level = "+pobj.getHRCT());
       }
           
    }
}
   
 
