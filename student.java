import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a");
        a = sc.nextInt();
        System.out.println("Nhập giá trị của b");
        b = sc.nextInt();

        int sum = a+b;

        System.out.println("Tổng của a và b là:" +sum);
    }
}
