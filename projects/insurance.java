import java.util.Scanner;

public class insurance {
    public static void main(String [] args){
        System.out.println("Enter the vehicle type");
        System.out.println("car,truck,bus,motorcycle");
        Scanner scan=new Scanner(System.in);
        String type=scan.nextLine();
        int premium=0;
        switch (type) {
            case "car":
                premium=100;
                break;
            case "truck":
                premium=200;
                break;
            case "bus":
                premium=250;
                break;
            case "motorcycle":
                System.out.println("Enter the type of motorcycle"); 
                System.out.println("Low,medium,high engine power");
               // Scanner scan =new Scanner(System.in);
                String motorType=scan.nextLine();
                switch(motorType){
                    case "Low":
                    premium=50;
                    break;
                    case "medium":
                    premium=75;
                    break;
                    case "high engine power":
                    premium=110;
                    break;
                    default:
                    System.out.println("unknown vehicle type");
                    break;
                }

            default:
             System.out.println("unknown vehicle type");
                break;
        }
        scan.close();
        System.out.println("The Premium of"+type+"= Rs:"+premium);
    
    }
}
