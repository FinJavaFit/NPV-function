
package npv.function;

import java.text.DecimalFormat;
import java.util.Scanner;

//Simple NPV calculator I created for my Corporate Finance class to make HW shorter
/*public class NPVFunction {

 
  
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       DecimalFormat formatter = new DecimalFormat("#,###,###");//formats result to display in cash/accounting format
       
         double total = 0;
         
                System.out.println("enter number of years for cashflows");
        
       int n = scan.nextInt(); //sets number of years for cashflow
        
       double aryNums [] = new double[n];//creates an array for the loop to store the values
       
                System.out.println("Enter WACC");
        
        double wacc = (scan.nextDouble()/100)+1;//the interest rate
      

                System.out.println("Please enter Initial Outlay");
        
        double inout = -scan.nextInt();//the amount of money needed to acquire the investment (Initial Outlay/Cost of Investment)
       
                System.out.println("enter cashflows");

       
        for (int i = 0; i < n; i++) {

                aryNums [i] = scan.nextInt()/Math.pow((wacc), i+1);
                //accepts each cash flow from the investment then divides it by the interest, and uses that to the exponent of the year
                //i.e. cashflow of year 3 = 7000 = (7000/4.5%)^3 

                total += aryNums [i]; //totals the investment's cashflow until loop closes (reaches "n")

                double lastval = total + inout;//takes the total then accounts for the initial outlay
            
            
            
            if (i == n - 1) { 
               System.out.println(formatter.format(lastval));//prints the final value after initial outlay has been accounted for
            }
        }
    }
}*/
/*for (double i: aryNums) {
           
         System.out.println(total);<<<enhanced loop. In case you want to continue using NPV, such as finding IRR
     }*/