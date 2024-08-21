package WEEK2;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 1000;  // example principal
        double rate = 5;          // example rate (in percentage)
        int years = 5;            // example number of years
        
        for (int i = 1; i <= years; i++) {
            double simpleInterest = (principal * rate * i) / 100;
            System.out.println("Year " + i + ": Simple Interest = " + simpleInterest);
        }
    }
}
