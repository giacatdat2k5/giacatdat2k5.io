import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int n;
        int s=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap n = ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i=i+1) {
           for (int gt=n;gt<=n;gt--){
                s+=(i/((i*gt)));
                System.out.println("tong la: "+s);

           } 
        }    
    }
}