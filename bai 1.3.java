import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a, b, s;
        Scanner ip= new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = ip.nextInt();
        System.out.println("Nhap so b: ");
        b = ip.nextInt();
        s = (a > b) ? a : b;
        System.out.println("So lon hon la: "+ s);
    }
}
