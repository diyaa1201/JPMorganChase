package main.java;
public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.00001;
    private double cashValue;
    private int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    public RewardValue(int milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        if (isMiles) {
            this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            this.cashValue = 0; // Handle default case if needed
        }
    }
    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return milesValue;
    }

    public static double getMilesToCashConversionRate() {
        return MILES_TO_CASH_CONVERSION_RATE;
    }
}

