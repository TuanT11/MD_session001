import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int radius = sc.nextInt();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("%.2f\n", area);
            test--;
        }
    }
}
