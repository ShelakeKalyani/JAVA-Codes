/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject.
Accept date as dd,mm,yyyy. Throw user defined exception "InvalidDateException" if the date
is invalid.
Developed Date  : 23-12-2022 
Technology Used : JAVA 
*/


import java.util.*;


class MyDate
{
   int day,month,year;

    MyDate(int day,int month,int year)
    {
       this.day = day;
       this.month = month;
       this.year = year;
    }

   

    public void Display()
    {
       System.out.println("Date = "+day);
      // System.out.print(" "+month);
       //System.out.print(" "+year);
    }
}


class InvalidDateException extends Exception
   {
        InvalidDateException(String s)
        {
           super(s);
        }
    }


class Exceptioneg4
{
   public static void main(String args[])  
   {
       int day,month,year;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter day,month and year = ");
       day = sc.nextInt();
       month = sc.nextInt();
       year = sc.nextInt();

       MyDate dobj = new MyDate(day,month,year);

       try
       {
           if(month<=0 || month>12)
                 throw new InvalidDateException("Inavalid Date");
       }
       catch(InvalidDateException im)
       {
   	      System.out.println(im.getMessage());
       }
    


      try
       {
           if((month==4 || month==6 || month==9 || month==11) && (day<=0 || day>30))
                 throw new InvalidDateException("Inavalid Date");
       }
       catch(InvalidDateException im)
       {
   	      System.out.println(im.getMessage());
       }

      try
       {
           if((month==2) || (day<=0 && day>29))
                 throw new InvalidDateException("Inavalid Date");
       }
       catch(InvalidDateException im)
       {
   	      System.out.println(im.getMessage());
       }

      
       try
       {
           if(day<=0 || day>31)
                 throw new InvalidDateException("Inavalid Date");
       }
       catch(InvalidDateException im)
       {
   	      System.out.println(im.getMessage());
       }
	
       finally
       {
          System.out.println("Date = "+day+" "+month+" "+year);
      }

   }
}

       
