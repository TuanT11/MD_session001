import java.util.Scanner;

public class Bai4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            System.out.print("width: ");
            float width = sc.nextFloat();
            System.out.print("height : ");
            float height = sc.nextFloat();
            System.out.printf("Diện tích: %.2f\n", width * height);
            System.out.printf("Chu vi: %.2f\n", (width + height) * 2);
            test--;
        }
    }
}
