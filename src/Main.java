public class Main {
    public static void main(String[] args) {
        CreditPaymentService payment = new CreditPaymentService();

        int paymentOneYear = payment.calculate(1_000_000, 9.99, 1);
        System.out.println(paymentOneYear);

        int paymentTwoYears = payment.calculate(1_000_000, 9.99, 2);
        System.out.println(paymentTwoYears);

        int paymentThreeYears = payment.calculate(1_000_000, 9.99, 3);
        System.out.println(paymentThreeYears);
    }
}
