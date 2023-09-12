package Homework;
import java.util.Scanner;

public class randomize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер билета: ");
        int a,b,c,d,e,f,t,o;
        int z = scanner.nextInt();
        a = z / 100000;
        b = z % 100000 / 10000;
        c = z % 10000 / 1000;
        d = z % 1000 / 100;
        e = z % 100 / 10;
        f = z % 10;
        t = a+b+c;
        o = d+e+f;
        if (t == o)
        {
            System.out.println("Поздравляем, билет выигрышный!");
        }
        else System.out.println("Сожалеем, у вас проигрыш!");
    }
}