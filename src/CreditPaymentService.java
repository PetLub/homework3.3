public class CreditPaymentService {
    public int calculate(int amountOfCredit, double percent, int months) {
        double result;
        double myPercent = 9.99 / (100 * 12);
        double degree = Math.pow((1 + myPercent), -months);
        result = amountOfCredit * myPercent / (1 - degree);
        return (int) result;


    }

}
