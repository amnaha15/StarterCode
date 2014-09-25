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
   
    String input= scan.nextln();
    input= input.toUpperCase();
    
    int num = Integer.ParseInt(input.substring(0,input.length()-1));
    
    if(input.charAt(input.length())== 'F'){
      //convert to Celsius
     int celc= (num * (9/5)) + 32;
     System.out.println(num + "F is " + celc + "C");
    }
    else if(input.charAt(input.length())=='C'){
      //convert to Fahrenheit
      int fahr = (num - 32) * (5/9);
      System.out.println(num + "C is " + fahr + "F");
    }
    else System.out.println("You didn't enter C or F");
    }
    }
   
    }
  
}


