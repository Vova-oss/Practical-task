package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите через пробел количество купюр различного номинала: Тридцать, пятьдесят, сто, пятьсот, тысяча(Только для работников банка) \n");
        Scanner in = new Scanner(System.in);
        int TR = in.nextInt();
        int S = in.nextInt();
        int PS = in.nextInt();
        int T = in.nextInt();
        int i=0,j=0,y=0,e=0,tr=0,s=0,ps=0,t=0;
        int sum = 30 * TR + 100 * S + 500 * PS * 1000 * T ;

        System.out.print("Введите сумму, которую желаете получить \n");
        int x = in.nextInt();
        if (x < 10 || x > sum || x % 10 > 0) {
            System.out.print("Данную сумму невозможно выдать. Обратитесь в другой банкомат.\n");
        } else {

            for( i=0;i<TR+1;i++){
                for( j=0;j<S+1;j++){
                    for( y=0;y<PS+1;y++){
                        for( e=0;e<T+1;e++){
                            if(i*30+j*100+y*500+e*1000==x){
                                tr=i;s=j;ps=y;t=e;
                                i=TR+1;j=S+1;y=PS+1;e=T+1;x=0;
                            }
                        }
                    }
                }
            }
            if (x == 0) {
                System.out.print("Вы получите: " + t+" купюр(ы) наминалом 1000, "+ ps+" купюр(ы) наминалом 500, \n"
                        + s +" купюр(ы) наминалом 100, "+ tr+" купюр(ы) наминалом 30." );
            }else   System.out.print("Данную сумму невозможно выдать. Обратитесь в другой банкомат.\n");
        }

    }
}