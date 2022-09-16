import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        int i, a;
        Scanner input=new Scanner(System.in);
        System.out.println("to how much you want the numbers");
        a= input.nextInt();
        if(a>=1) {
            for ( i= 0; i <= a; i++)
            System.out.println(i);
        }
        else
            System.out.println("not the number negative");
    }
}
