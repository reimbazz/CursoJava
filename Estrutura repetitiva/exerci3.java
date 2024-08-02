//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
import java.util.Scanner;

public class exerci3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opicao,alcool, diesel, gasolina;
        alcool = 0;
        diesel = 0;
        gasolina = 0;

        System.out.println("Digite sua opção: ");
        opicao = sc.nextInt();

        while (opicao !=4) {
            switch (opicao) {
                case 1:
                    alcool = alcool +  1;
                    break;
                case 2:
                    gasolina = gasolina + 1;
                    break;
                case 3:
                    diesel = diesel + 1;
                    break;
            }
            System.out.println("Digite sua opção: ");
            opicao = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
