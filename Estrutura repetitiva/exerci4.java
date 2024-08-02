//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
//X, se for o caso.

import java.util.Scanner;

public class exerci4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i;
        numero = sc.nextInt();
        sc.close();
        for(i = 1; i <= numero; i = i + 2){
            System.out.println(i);
     
        }
    }
}
