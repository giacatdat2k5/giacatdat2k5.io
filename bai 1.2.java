

public class App {
   public static void main(String[] args){
    int a, b;
    Scanner ip= new Scanner(System.in);
    System.out.println("Nhap so a: ");
    a = ip.nextInt();
    System.out.println("Nhap so b: ");
    b = ip.nextInt();
    String s = (a > b) ? a : b;
    System.out.println(s);
   }
}

