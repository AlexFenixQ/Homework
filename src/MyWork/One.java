package MyWork;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int i,num,sum;
        sum = 0;
        for (i=1; i<=n; i++)
        {
            System.out.print("Число: ");
            num = scanner.nextInt();
            sum = sum+num;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
