import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourcFile = new File(sourceFileStr);
        String sourceFolder = sourcFile.getParent();

        String targetFileStr = sourceFolder + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String intemCsv = br.readLine();

            while (intemCsv != null) {
                String[] fields = intemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                intemCsv = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                
                for(Product item : list){
                    bw.write(item.getName() + ", " + String.format("%.2f",item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + "CREATED");

            } catch (IOException e) {
                System.err.println("Error writing file: " + e.getMessage());
            }


        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}