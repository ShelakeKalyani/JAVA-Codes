/*
Developer Name  : Shelake Kalyani Rajendra
Program Name    : Write a simple currency converter, as shown in the figure. User can enter the amount of
"Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted
values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD,
1 USD = 0.92 Euro, 1 SGD = 0.65 Euro.
Developed Date  : 24-12-2022 
Technology Used : JAVA 
*/


import java.awt.*;       
import java.awt.event.*;  


public class AWTAccumulator extends Frame {
   
   private TextField tfInput;  
   private TextField tfOutput; 
    private TextField tfOutput1; 
   private double US= 0;  
   private double Euros=0;      


   public AWTAccumulator() 
   {
      setLayout(new FlowLayout());


      add(new Label("Singapore Dollars: "));  

      tfInput = new TextField(20); 
      add(tfInput);                

      tfInput.addActionListener(new TFInputListener());    
  
      add(new Label("US Dollars :"));  

      tfOutput = new TextField(30); 
      tfOutput.setEditable(false);  
      add(tfOutput); 
     // tfOutput.setBounds(50,60,50,50);               
      tfInput.addActionListener(new TFInputListener());     
      add(new Label("Euros :"));  

      tfOutput1 = new TextField(30); 
      tfOutput1.setEditable(false);  
      add(tfOutput1);                

      setTitle("Currency Converter ");  
      setSize(350, 350);  
      setVisible(true);   
   }

  
   public static void main(String[] args) {

      new AWTAccumulator();
   }

   
   private class TFInputListener implements ActionListener {
      
      @Override
      public void actionPerformed(ActionEvent evt) {
        
         int numberIn = Integer.parseInt(tfInput.getText());    //100
         US = numberIn*0.70;               
         tfInput.setText("");  
         tfOutput.setText(US + ""); 
         
         Euros=numberIn*0.65;
         tfInput.setText("");  
         tfOutput1.setText(Euros + ""); 
         
                                    
      }
   }
}
