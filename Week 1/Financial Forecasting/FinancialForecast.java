public class FinancialForecast {

    
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
       
        if (years == 0) {
            return initialAmount;
        }

        
        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000;  
        double annualGrowthRate = 0.07;    
        int years = 5;

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);
        System.out.printf("Future Value after %d years: Rs.%.2f\n", years, futureValue);
    }
}
