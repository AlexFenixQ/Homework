package MyWork;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int i,num,sum;
        sum = 0;
        for (i=1; i<=n; i++)
        {
            System.out.println("Число: ");
            num = scanner.nextInt();
            if (num % 2 == 0)
            {
                sum++;
            }
        }
        System.out.println("Все четные числа: " + sum);
    }
}
