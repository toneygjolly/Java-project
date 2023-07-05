import java.util.ArrayList;
import java.util.Scanner;

public class budget {
    public static void main(String[] args){
        System.out.println("Enter your budget amount");
        Scanner scan=new Scanner(System.in);
        Double budget=scan.nextDouble();
        ArrayList<Double>amount=new ArrayList<Double>();
        System.out.println("Enter the budget");
        int i=0;
        double sum=0;
        do{
         System.out.println("enter the expense"+(i+1)+":");
                   Double value=scan.nextDouble();
                   amount.add(value);
                   sum+=amount.get(i);
        }
        while(sum<budget);
        //scan.close();
        System.out.println("value"+sum+"the value is over budget amount");
        if(sum<budget){
        System.out.println("close");
        System.out.println("value"+sum+"the value is over budget amount");

       }
       
        

                  }              
        }

    

