import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        String employee;
        double salary,hours,price,newsl;


        Scanner input=new Scanner(System.in);

        System.out.println("enter the name employee: ");
        employee= input.next();
        System.out.println("enter the salary:");
        salary=input.nextDouble();
        price=salary/24;
        System.out.println("the price of the hours is ="+price);

            System.out.println("enter the number of hours:");
            hours= input.nextDouble();
            newsl=hours*price;
        System.out.println("the salary ="+newsl);

    }
}
