import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
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
        } 
        for (int i = 0; i < n; i++){
            if ((array[i] % 4 ==0) || (array[i] / 100 == 3 )){
                sum +=array[i];
            System.out.println("\ntong cac so: " + sum+ "\t");
        }else{
            System.out.println("khong co gi");
        }
    }
}
}

