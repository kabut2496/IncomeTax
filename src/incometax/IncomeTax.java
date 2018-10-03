/*
 * Karl Butler
 *10/03/2018
 *to calculate IncomeTax
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyInput = new Scanner(System.in);
     //declaring variables
     double sal,taxL1,taxL2,taxL3,taxL4,taxL5,tax1,tax2,tax3,tax4,tax5,tax;
     
    System.out.println("pleas enter your yearly salary");
   //giving variables values
    sal = keyInput.nextDouble();
    
    taxL1= 46605;
    taxL2 =93208 ;
    taxL3 = 144489;
    taxL4 = 205842;
    taxL5 = 205842;
    
    tax1=0.15;
    tax2=0.205;
    tax3=0.26;
    tax4=0.29;
    tax5=0.33;
    
    tax=0;
    
    //the magic of the program
    if(sal>=taxL5){
    tax=sal*tax5;
    }
    
    if(sal<=taxL4){
    tax=sal*tax4;
    if(sal<=taxL3){
    tax=sal*tax3;
    if(sal<=taxL2){
    tax=sal*tax2;
    if (sal<=taxL1){
    tax=sal*tax1;
    }
    }
    }
    }
    tax=Math.round(tax*100)/100;
    System.out.println("you will be taxed "+tax+ " on your yearly salary");
    }
    
}
   
