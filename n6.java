import java.util.Scanner;

public class n6 {
    public static void main(String[] args) {
        int month;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the month you want to number : ");
        month= input.nextInt();
        if(month>=1 && month<=12)
        {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.println("the days of month are 31 days");
           else if (month == 4 || month == 6 || month == 9 || month == 11)
                System.out.println("the days of month are 30 days");
          else
                System.out.println("the days of month are 28 days");
        }
        else
            System.out.println("the number if month true try again");
    }
}
