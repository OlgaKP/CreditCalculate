public class CreditPaymentService {
    public int calculate(int sum, double percent, int years){
        double creditPercent = percent / ( 100 * 12);
        int n = years * 12;
        double exp = Math.pow((1 + creditPercent), n);
        double payment = sum * ( creditPercent + creditPercent / (exp - 1));
        int result = (int) payment;
        return result;
    }
}
