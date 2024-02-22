/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a simple currency converter, as shown in the figure. User can enter the amount of
"Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted
values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD,
1 USD = 0.92 Euro, 1 SGD = 0.65 Euro.
Developed Date  : 30-12-2022 
Technology Used : JAVA 
*/


import java.awt.*;       
import java.awt.event.*;  


public class celcius extends Frame {
   
   private TextField tfInput;  
   private TextField tfOutput;
   private double f= 0;  
       


   public celcius() 
   {
      setLayout(new FlowLayout());
      add(new Label("Celcius: "));  
      tfInput = new TextField(30); 
      add(tfInput);                

       
  
      add(new Label("farenheit :"));  

      tfOutput = new TextField(30); 
      tfOutput.setEditable(false);  
      add(tfOutput); 
          tfInput.addActionListener(new TFInputListener());        
      
      setTitle("Temperature Converter ");  
      setSize(350, 350);  
      setVisible(true);   
   }

  
   public static void main(String[] args) {

      new celcius();
   }

   
   private class TFInputListener implements ActionListener {
      
      @Override
      public void actionPerformed(ActionEvent evt) {
        
        double numberIn = Double.parseDouble(tfInput.getText());    //100
         f = (numberIn*9/5)+32;               
         tfInput.setText("");  
         tfOutput.setText(f + ""); 
         
     
         
                                    
      }
   }
}
