import java.util.Scanner;

public class budjet{
    public static void main(String[] args){
        System.out.println("Enter the Budget amount::");
        Scanner sc=new Scanner(System.in);
        double budget=sc.nextDouble();
        double totalExpenses=0;
        while(budget>=totalExpenses){
            System.out.println("Enter the expense name");
            String name=sc.next();
            System.out.println("enter the expenses Rs:");
             double expense =sc.nextDouble();
             totalExpenses +=expense;
            
             if(totalExpenses<=budget){
                System.out.println("Remaining amount"+(budget-totalExpenses));
             }
             else{
                System.out.println("Budget exceeded!");
                 
                break;
             }
            System.out.println("The expense :"+name+" Rs:" +expense);
        }
   
    }
}


