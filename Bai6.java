import java.util.Scanner;

public class Bai6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float vanToc;
        float thoiGian;
        while(true){
            System.out.print("Vận tốc = ");
            vanToc = sc.nextFloat();
            if(vanToc < 1) continue;
            break;
        }
        while(true){
            System.out.print("Thời gian = ");
            thoiGian = sc.nextFloat();
            if(thoiGian < 1) continue;
            break;
        }
        System.out.println("Quãng đường = "+ (vanToc * thoiGian));
    }
}
