
package alistirmalar_iki;

import java.util.Scanner;

/**
 *
 * @author BARIŞ
 */
public class Alistirmalar_iki {

    
    public static void main(String[] args) {
      
        
       Scanner input = new Scanner(System.in);
       // Prompt the user to enter weight in pounds
       System.out.print("Enter weight in pounds: "); double weight = input.nextDouble();
       // Prompt the user to enter height in inches
       System.out.print("Enter height in inches: "); double height = input.nextDouble();
       final double KILOGRAMS_PER_POUND = 0.45359237; // Constant final double METERS_PER_INCH = 0.0254; // Constant
       // Compute BMI

       final double METERS_PER_INCH = 0.0254; // Constant

       double weightInKilograms = weight * KILOGRAMS_PER_POUND;
       double heightInMeters = height * METERS_PER_INCH;
       double bmi = weightInKilograms /(heightInMeters * heightInMeters);
       // Display result
       System.out.println("BMI is " + bmi); if (bmi < 18.5)
       System.out.println("Underweight"); else if (bmi < 25)
       System.out.println("Normal"); else if (bmi < 30)
       System.out.println("Overweight"); else
       System.out.println("Obese");
        
        
 
double a,b,c;
double sonuc;
double matris;
double root1;
double root2;

System.out.print("Enter the a,b,c variables : ");
Scanner input3 = new Scanner(System.in);   


a = input3.nextDouble(); b = input3.nextDouble(); c = input3.nextDouble();

 
matris = b*b - (4*a*c);

root1 = (-b + Math.sqrt(matris)) / 2*a ;

root2 = (-b - Math.sqrt(matris)) / 2*a ;     
        
      
        
if(matris>0){
    
    System.out.println("You have two real roots");
    
    
    System.out.println("First root is : "+root1);
    
    System.out.println("Second root is : "+root2);
    
    
    
    
}else if(matris<0){
    
    
    System.out.println("You dont have a real root");
    
    
}else if(matris==0){

    System.out.println("Root is = 0");
   
            }
        
        
    }
    
}
