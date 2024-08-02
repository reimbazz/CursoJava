package application;

import java.sql.Date;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Deparment;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deparment's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Deparment(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i=1; i<n; i++){
            System.out.println("Enter contract #" + i + "data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.err.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDeparment().getName());
        System.out.println("Income for " + monthAndYear +": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
