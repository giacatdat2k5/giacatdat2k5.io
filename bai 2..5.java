import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float a,b, x;
        Scanner ip= new Scanner(System.in);
        System.out.println("nhap he so a");
        a = ip.nextFloat();
        System.out.println("nhap he so b");
        b= ip.nextFloat();
        x= -b- a;
        System.out.println("x = "+ x);

    }
}
