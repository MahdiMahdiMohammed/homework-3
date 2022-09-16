public class n1 {
    public static void main(String[] args) {
        System.out.println("number 1");

        int n=1;
        int m=-1;
        if(n<-m)
            System.out.println(n);
        else System.out.println(m);
        //-1
        System.out.println("---------------------------");
        System.out.println("number 2");
        int x=1;
        int y=-1;
        if(-x>=y)
            System.out.println(x);
        else
            System.out.println(y);
        //-1
        System.out.println("---------------------------");
        System.out.println("number 3");
        double a=0,b=1;
        if(Math.abs(a-b)<1)
            System.out.println(n);
        else System.out.println(b);
        //1
        System.out.println("---------------------------");
        System.out.println("number 4");

        double z=Math.sqrt(2);
        double s=2;
        if(x*x==y)
            //1.4
            System.out.println(z);
        else
            System.out.println(s);
    }
}
