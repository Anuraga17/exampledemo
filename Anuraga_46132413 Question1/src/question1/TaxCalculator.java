package question1;
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Monthly Salary : ");
        double month=sc.nextDouble() , tax=1;
        System.out.println("Monthly salary : " + month);
        double annual=month*12;
        System.out.println("Annual salary : " + annual);
        if(annual<=250000)
        {
           System.out.println("No tax");
        }
        else if(annual>=500001 && annual<=1000000)
        {
           tax=(annual-250000);
           tax=((tax-250000)/100)*20;
           tax=tax+25000;
           System.out.println("Taxable Amount : " + tax);
        }
        else if((annual>250001) && (annual<=500000))
        {
           tax=((annual-250000)/100)*10;
           System.out.println("Taxable Amount : " + tax);
        }
        else
        {
            tax=annual-250000;
            tax=tax-250000;
            tax=((tax-500000)/100)*30;
            tax=tax+125000;
            System.out.println("Taxable Amount : " + tax);
        }
           
    }
}