public class CreditPaymentService {
    public int calculate(double creditPeriod, double creditAmount) {

        double monthlyInterestRate = 0.0999 / 12;
        double numberOfPayments = creditPeriod * 12;
        double coefficient = ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments)) / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1));
        double result = creditAmount * coefficient;

        return (int) result;
    }

}
