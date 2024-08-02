//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
import java.util.Scanner;

public class exerci5 {
    public static void main(String[] args) {
        Scanner sexo = new Scanner(System.in);
        int n, in = 0, out = 0, i, num;
        n = sexo.nextInt();

        for(i = 0; i != n; i++){
            num = sexo.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            }
            else{
                out++;
            }
        }
        sexo.close();
        System.out.println(in + " in");
        System.out.println( out + " out");
    }
}
