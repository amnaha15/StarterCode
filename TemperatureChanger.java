/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Amnah Ahmad
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {
    // TODO - scan for input in the format 175F or 18C 
    
    Scanner scan = new Scanner(System.in);
    System.out.println("What would you like to convert? - insert number + F or C");
   
    String input= scan.nextLine();
    char unit = input.charAt(input.length()-1);
    
    double num = Double.parseDouble(input.substring(0,input.length()-1));
    
    if(unit == 'F'|| unit =='f'){
      //convert to Celsius
     double celc= (num * (9.0/5)) + 32;
     System.out.println(num + "F is " + celc + "C");
    }
    else if(unit =='C'|| unit == 'c'){
      //convert to Fahrenheit
      double fahr = (num - 32) * (5.0/9);
      System.out.println(num + "C is " + fahr + "F");
    }
    else{
 System.out.println("You didn't enter C or F");
    }
    }
    }
   



