import java.util.Scanner;
import java.util.SortedMap;

public class n7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float n[]=new float[3];
        System.out.println("entr the number ");
        for(int i=1;i<=3;i++){
            System.out.println("the number "+i+"=");
            n[i-1]= input.nextFloat();
        }
if(n[0]<n[1]&&n[1]<n[2])
    System.out.println("in order "+n[0]+" "+n[1]+" "+n[2]+"\n"+n[0]+" "+n[1]+" "+n[2]);
else if (n[0]>n[2]&&n[2]>n[1]) {
    System.out.println("in order "+n[0]+" "+n[2]+" "+n[1]+"\n"+n[0]+" "+n[1]+" "+n[2]);

}
else if(n[1]>n[0]&&n[0]>n[2])
    System.out.println("neither"+n[1]+" "+n[0]+" "+n[2]+"\n"+n[0]+" "+n[1]+" "+n[2]);
else if(n[1]>n[2]&&n[2]>n[0])
    System.out.println("neither"+n[1]+" "+n[2]+" "+n[0]+"\n"+n[0]+" "+n[1]+" "+n[2]);
else if (n[2]>n[0]&&n[0]>n[1])
    System.out.println("neither"+n[2]+" "+n[0]+" "+n[1]+"\n"+n[0]+" "+n[1]+" "+n[2]);
else if (n[2]>n[1]&&n[1]>n[0])
    System.out.println("neither"+n[2]+" "+n[1]+" "+n[0]+"\n"+n[0]+" "+n[1]+" "+n[2]);
else
    System.out.println("no"+"\n"+n[0]+" "+n[1]+" "+n[2]);
    }
}
