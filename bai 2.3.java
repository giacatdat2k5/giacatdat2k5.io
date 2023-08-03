import java.util.Scanner;

public class App {
    
        public static void main(String[] args) {
        int n, sum = 0, tempSort;
        int sd = 0,sa=0,sk=0;
        Scanner scanner = new Scanner(System.in);            
        do {
            System.out.println("nhap so so cua day: ");
            n = scanner.nextInt();
        } while (n < 0);
        int array[] = new int[n];           
        System.out.println("nhap cac so cho day: ");
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so thu " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nday so: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        } for (int i = 0; i < n; i++){
            if (array[i] > 0){
                sd = sd+1;
            } else if (array[i]<0){ 
                sa = sa+1;
            } else {
                sk = sk+1;
                System.out.println("\nso duong la:"+ sd+"\nso am la: "+ sa+"\nso khong la: "+sk );
            }
            }
        }
    }