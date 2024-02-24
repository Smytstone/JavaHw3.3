public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int loanTerm) {
        double loanRate = interestRate / 12 / 100;
        int monthPayment = (int) (loanAmount * loanRate *
                Math.pow(1 + loanRate, loanTerm) / (Math.pow(1 + loanRate, loanTerm) - 1));
        return monthPayment;
    }
}
