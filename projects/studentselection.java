import java.util.Scanner;


public class studentselection {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of students ");
        Scanner sc=new Scanner(System.in);
        int numStudent=sc.nextInt();
        String[] student=new String[numStudent];
        int[]age = new int[numStudent];
        Scanner scName =new Scanner(System.in);
        Scanner scAge =new Scanner(System.in);
        for(int i=0;i<=numStudent;i++)
        {
        System.out.println("Enter name:");
        student[i] = scName.nextLine();
        System.out.println("Enter age");
        age[i]=scAge.nextInt();

        }
        for(int i=0;i<numStudent;i++)
        {
        if(age[i]>=15)
        {
                System.out.println(student[i]+"can recive the vacine");
                System.out.println("The student is now"+age[i]);
        }

        }
        sc.close();
        scName.close();
        scAge.close();


            
    
    }

}
