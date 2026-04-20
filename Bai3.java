import java.util.Scanner;

public class Bai3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println((a * d) + (b * c) + "/" + (b*d));
            test--;
        }
    }
}
