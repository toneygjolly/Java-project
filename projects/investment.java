import java.util.Scanner;

public class investment{
    public static void main(String[] args)
    {
        //Store the buying price
        System.out.println("entering the buying price per share");
        Scanner scan=new Scanner(System.in);
        double buyingPrice=scan.nextDouble();
        int day=1;
        double closingPrice=0.1;
        while(true){
            //store the closing price
        System.out.println("enter the closing price for day"+day);
        closingPrice=scan.nextDouble();
            if(closingPrice <0.0) break;
            double earning =closingPrice-buyingPrice;
            if(earning>0){
                System.out.println("After the day"+day+"you earned"+earning+"per share");
            }
            else if(earning<0){
                                System.out.println("After the day"+day+"you lossed"+earning+"per share");

            }
            else{
                System.out.println("After the day"+day+"you have no earnings per share");
            }
            day+=1;
        }
        scan.close();
        

    }
}