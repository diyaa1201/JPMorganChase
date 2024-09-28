package main.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true); // Assuming 'true' means it's miles
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        int expectedMilesValue = (int) (cashValue / RewardValue.getMilesToCashConversionRate());
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        double expectedCashValue = milesValue * RewardValue.getMilesToCashConversionRate();
        var rewardValue = new RewardValue(milesValue, true); // Assuming 'true' means it's miles
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
