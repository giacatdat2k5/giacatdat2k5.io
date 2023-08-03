public class App {
    public static void main(String[] args) throws Exception {
        int t=0, s=0;
        for(int i=1;i<=30;i++){
            if(i%2==0){
                t=t+1;
                s=s+i;
                if(t>10){
                    
                    System.out.println("tong 10 so chan dau tien: "+s);
                    break;
                }
            }
        }
    }
}
