public class CreditPaymentService {
    public int calculate (int a,double b,int c){
      double result;
      double myPercent = 9.99 / (100 * 12);
      double degree = Math.pow((1 + myPercent),-c);
      result = a * myPercent / (1 - degree);
      return (int)result;


    }

}
