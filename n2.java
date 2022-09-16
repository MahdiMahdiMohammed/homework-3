import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a;
        System.out.println("enter the number ");
        a= input.nextInt();
        if(a==0)
        {System.out.println("the number zero");

        }
        else if(a>0)


            System.out.println("the number postiv");
        else
            System.out.println("the number ngtive");

    }
}
