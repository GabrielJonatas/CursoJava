import contract.entities.Contract;
import contract.entities.MonthlyPayment;
import contract.services.PaypalPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contract contract = new Contract();

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Número: ");
        contract.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        try {
            String data = sc.nextLine();
            LocalDate localDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            contract.setDate(localDate.atStartOfDay());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.print("Valor do contrato: ");
        contract.setContractValue(sc.nextDouble());

        System.out.print("Entre com o número de parcelas: ");
        contract.setInstallments(sc.nextInt());

        System.out.println("Parcelas:");

        contract.processContractPayment(new PaypalPaymentService());

        List<MonthlyPayment> monthlyPaymentList = contract.getMonthlyPaymentList();

        for(MonthlyPayment monthlyPayment: monthlyPaymentList) {
            System.out.print(monthlyPayment.getDate().format(formatter) + " - " + monthlyPayment.getValue() + "\n");
        }
    }
}