import java.util.Scanner;

public class App {
   String ten;
   String lop;
   String truong;
   String gt;
   String ns;
   String qq;
 
    void nhap(){ 
    Scanner ip= new Scanner(System.in);
    System.out.println("Nhap ten cua ban");
    ten = ip.nextLine();
    System.out.println("Nhap lop cua ban: ");
    lop = ip.nextLine();
    System.out.println("Nhap truong cua ban: ");
    truong = ip.nextLine();
    System.out.println("Nhap gioi tinh cua ban: ");
    gt = ip.nextLine();
    System.out.println("Nhap ngay sinh cua ban: ");
    ns = ip.nextLine();
    System.out.println("Nhap que quan cua ban: ");
    qq = ip.nextLine();

 
    ip.close();
    }
 
   
    void xuat(){
        System.out.print(" - -- - Thong tin vua nhap: ----");
        System.out.println("\nHo va ten: "+ten +"\n Lop: "+lop +"\n Truong: "+truong +"\n Gioi Tinh: "+gt +"\n Ngay Sinh: "+ns +"\n Que quan: "+qq);
    } 
    public static void main(String[] args){
       App a= new App();
       a.nhap();
       a.xuat();
 
    }
}