public class SimpleInterestCalculator {

    
    public double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    
    public double calculateInterest(double principal, double rate) {
        return calculateInterest(principal, rate, 1);
    }

    public static void main(String[] args) {
        SimpleInterestCalculator sic = new SimpleInterestCalculator();

        
        double interest1 = sic.calculateInterest(10000, 5, 2); // 2 years
        System.out.println("Interest for 2 years: " + interest1);

        
        double interest2 = sic.calculateInterest(10000, 5); // Default 1 year
        System.out.println("Interest for 1 year (default): " + interest2);
    }
}
