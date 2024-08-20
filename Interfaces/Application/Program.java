package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contract;
import Entities.Installment;
import Service.ContractService;
import Service.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.println("Numero: ");
        int num = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(num, date, totalValue);

        System.out.println("Insira o numero de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, parcelas);

        System.out.println("Parcelas: ");
        for (Installment i : obj.getInstallments()) {
            System.out.println(i);
        }
        
        sc.close();
    }
}
