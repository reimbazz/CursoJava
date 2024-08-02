//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("É par");
        } 
        else{
            System.out.println("É impar ");
        }
            
        sc.close();
    }

}