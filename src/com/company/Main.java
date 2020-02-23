package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите через пробел количество купюр различного наминала: Десять, пятьдесят, сто, пятьсот, тысяча, пять тысяч(Только для работников банка) \n");
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int P = in.nextInt();
        int S = in.nextInt();
        int PS = in.nextInt();
        int T = in.nextInt();
        int PT = in.nextInt();
        int sum = 10 * D + 50 * P + 100 * S + 500 * PS * 1000 * T + 5000 * PT;

        System.out.print("Введите сумму, которую желаете получить \n");
        int x = in.nextInt();
        if (x < 10 || x > sum || x % 10 > 0) {
            System.out.print("Данную сумму невозможно выдать. Обратитесь в другой банкомат.\n");
        } else {

            int klon = x;
            PT = klon / 5000;
            x = x - 5000 * PT;
            klon = x;
            T = klon / 1000;
            x = x - 1000 * T;
            klon = x;
            PS = klon / 500;
            x = x - 500 * PS;
            klon = x;
            S = klon / 100;
            x = x - 100 * S;
            klon = x;
            P = klon / 50;
            x = x - 50 * P;
            klon = x;
            D = klon / 10;
            x = x - 10 * D;
            if (x == 0) {
                System.out.print("Вы получите: " + PT+ " купюр(ы) наминалом 5000, "+ T+" купюр(ы) наминалом 1000, "+ PS+" купюр(ы) наминалом 500, \n"
                        + S+" купюр(ы) наминалом 100, "+ P+" купюр(ы) наминалом 50, "+ D+" купюр(ы) наминалом 10. " );
            }
        }

    }
}