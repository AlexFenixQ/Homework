package Homework;
import java.util.Scanner;

public class Davlenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double g,P,p,D,r,S;
        int m;
        m = 100;
        g = 9.81;
        p = 3.14;
        D = 50;
        r = (D / 2);
        S = 2*p*(r*r);
        P = (m*g)/S;
        if (P > 1000 && P < 6000)
        {
            System.out.println("Давление в пределах нормы: " + S);
        }
        else if (P < 1000)
        {
            System.out.println("Давление ниже нормы: " + S);
        }
        else if (P > 6000)
        {
            System.out.println("Давление выше нормы: " + S);
        }
    }
}