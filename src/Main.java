public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditPeriod = 1;
        double creditAmount = 1_000_000;
        int result = service.calculate(creditPeriod, creditAmount);

        System.out.println("Сумма ежемесячного платежа при сроке кредита - 1 год:");
        System.out.println(service.calculate(creditPeriod = 1, creditAmount = 1_000_000));

        System.out.println("Сумма ежемесячного платежа при сроке кредита - 2 годf:");
        System.out.println(service.calculate(creditPeriod = 2, creditAmount = 1_000_000));

        System.out.println("Сумма ежемесячного платежа при сроке кредита - 3 года:");
        System.out.println(service.calculate(creditPeriod = 3, creditAmount = 1_000_000));


    }
    }
