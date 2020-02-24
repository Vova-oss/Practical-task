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
        int d=0,p=0,s=0,ps=0,t=0,pt=0;
        int sum = 10 * D + 50 * P + 100 * S + 500 * PS * 1000 * T + 5000 * PT;

        System.out.print("Введите сумму, которую желаете получить \n");
        int x = in.nextInt();
        if (x < 10 || x > sum || x % 10 > 0) {
            System.out.print("Данную сумму невозможно выдать. Обратитесь в другой банкомат.\n");
        } else {

            if(x>4999) {
                pt = x / 5000;
                while (pt > PT) {
                    pt--;
                }
                x = x - 5000 * pt;
            }
            if(x>999) {
                t = x / 1000;
                while (t > T) {
                    t--;
                }
                x = x - 1000 * t;
            }
            if(x>499) {
                ps = x / 500;
                while (ps > PS) {
                    ps--;
                }
                x = x - 500 * ps;
            }
            if(x>99) {
                s = x / 100;
                while (s > S) {
                    s--;
                }
                x = x - 100 * s;
            }
            if(x>49) {
                p = x / 50;
                while (p > P) {
                    p--;
                }
                x = x - 50 * p;
            }
            if(x>9) {
                d = x / 10;
                while (d > D) {
                    d--;
                }
                x = x - 10 * d;
            }
            if (x == 0) {
                System.out.print("Вы получите: " + pt+ " купюр(ы) наминалом 5000, "+ t+" купюр(ы) наминалом 1000, "+ ps+" купюр(ы) наминалом 500, \n"
                        + s +" купюр(ы) наминалом 100, "+ p+" купюр(ы) наминалом 50, "+ d+" купюр(ы) наминалом 10. " );
            }else   System.out.print("Данную сумму невозможно выдать. Обратитесь в другой банкомат.\n");
        }

    }
}