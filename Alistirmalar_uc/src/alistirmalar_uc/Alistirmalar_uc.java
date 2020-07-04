
package alistirmalar_uc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BARIŞ
 */
public class Alistirmalar_uc {

  public static void main(String[] args) {
  /*    
  double x,y,e,f,a,b,c,d;
 
 System.out.println("Enter the a,b,c,d,e,f variables: ");
 Scanner input = new Scanner(System.in);
 
 a =input.nextDouble(); b =input.nextDouble(); c =input.nextDouble(); d =input.nextDouble(); e =input.nextDouble(); f =input.nextDouble();
 
 x= (e*d - b*f) / (a*f)-(e*c);
 
 y= (a*d)-(b*c) / (a*d)-(b*c);
 
 e = a*x + b*y;        
 f = c*x + d*y;
 
 
 System.out.println("x = "+x);
 System.out.print("y = "+y);
 
 */
 ///* 
  
 int ay;
  
 Random rastgele = new Random();
 
 //ay = rastgele.nextInt(12);
 ay = rastgele.nextInt(12);
 
    switch(ay){
    case 0:
    System.out.println("This mounth is January..");
     break;
    case 1:
    System.out.println("This mounth is February..");  
    break;
    case 2:
    System.out.println("This mounth is March..");
    break;
    case 3:
    System.out.println("This mounth is April..");    
    break;
    case 4:
    System.out.println("This mounth is May..");     
    break;
    case 5:  
    System.out.println("This mounth is June..");  
    break;
    case 6:
    System.out.println("This mounth is July..");
    break;
    case 7: 
    System.out.println("This mounth is August..");
    break;
    case 8:
    System.out.println("This mounth is September..");
    break;  
    case 9:    
    System.out.println("This mounth is October..");
    break; 
    case 10:
    System.out.println("This mounth is November..");
    break;
    case 11:
    System.out.println("This mounth is December..");
    break;
    
    
    
}
//*/
    }
}