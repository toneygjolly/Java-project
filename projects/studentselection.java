import java.util.Scanner;

public class vaccine{
    public static void main(String[] args){
        System.out.println("$$$For getting the vaccine Age will above 15 $$$$$");
        System.out.println("enter the number of students");
        Scanner sc=new Scanner(System.in);
        int numStudent=sc.nextInt();
        
            
            String []name=new String[numStudent];
            Scanner scname=new Scanner(System.in);
            
           int[]age= new int[numStudent];
           Scanner scage=new Scanner(System.in);
            
        
        for(int i=0;i<numStudent;i++){
        System.out.println("Enter the name");
        name[i]=sc.next();
        System.out.println("Enter the age");
        age[i]=sc.nextInt();
        
        
        }
 for(int i=0;i<numStudent;i++){
    
 if(age[i]>15){

 System.out.println("Eligible for vaccine::"+name[i]+", Age :"+age[i]);
 
 }
 else{
    System.out.println("Not Eligible for vacine::"+name[i]+", Age :"+age[i]);
 } 
}
sc.close();
scname.close();
scage.close();

           
        }
        

    } 
