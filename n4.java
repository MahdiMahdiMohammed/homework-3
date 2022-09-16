import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the 3numbers a,b,c");
        a=input.nextInt();
        System.out.println("..");
        b=input.nextInt();
        System.out.println("..");
        c=input.nextInt();
        if((a==c)&&(a==b)&&(b==c)) {
            System.out.println("the three number are aqual a,b,c = "+c);
        } else if (a==b)
            System.out.println("the two number are aqual a,b = "+b);
            else if(a==c)
            System.out.println("the two number are aqual a,c = "+a);
        else if(b==c)
            System.out.println("the two number are aqual b,c = "+b);

        else
            System.out.println("not aqual");



    }
}
