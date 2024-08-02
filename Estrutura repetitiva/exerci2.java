//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
import java.util.Scanner;

public class exerci2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x>0 && y>0) {
                System.out.println("O ponto está no primeiro quadrante");
            }
            else if (x < 0 && y>0) {
                System.out.println("O ponto está no segundo quadrante");
            }
            else if (x<0 && y<0) {
                System.out.println("O ponto está no terceiro quadrante");
            }
            else if (x>0 && y<0) {
                System.out.println("O ponto está no quarto quadrante");
            }
            x = sc.nextInt();
            y = sc.nextInt();

        }
        sc.close();
    }
}
