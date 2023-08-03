import java.util.Scanner;

public class App {
    public static void main(String[] args){
        float a, b, c, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = sc.nextFloat();
        System.out.println("nhap b: ");
        b = sc.nextFloat();
        System.out.println("nhap c:");
        c = sc.nextFloat();
          if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
        float denta;
        denta= b*b - 4*a*c;
        if(denta <0){
            System.out.println("pt ko co nghiem");
        }else if (denta >0){
            x1= (-b)/2*a;
            System.out.println("pt có nghiem kep x1=x2: "+ x1);
        }else{
            x1 = (float) ((-b + Math.sqrt(denta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(denta)) / (2*a));
            System.out.println("pt có 2 no phan biet x1= "+x1+"x2= "+x2);
        }
    }
}
}
