package WEEK2;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int limit = 10; // example limit
        int sum = 0;
        int i = 1;
        
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= limit);
        
        System.out.println("Sum of even numbers from 1 to " + limit + " = " + sum);
    }
}
