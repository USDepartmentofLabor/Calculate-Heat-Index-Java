package src.main.test.gov.dol;

import org.junit.Test;
import src.main.java.gov.dol.CalculateHeatIndex;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the heat index calculator
 */
public class CalculateHeatIndexTest {
    public static final double ACCEPTED_VARIANCE = 0.001;

    @Test
    public void testCalculatesHeatIndexCorrectly() {
        assertEquals(104.9, CalculateHeatIndex.heatIndexCal(98, 40), ACCEPTED_VARIANCE);
        assertEquals(91.5, CalculateHeatIndex.heatIndexCal(82, 90), ACCEPTED_VARIANCE);
        assertEquals(94.6, CalculateHeatIndex.heatIndexCal(90, 50), ACCEPTED_VARIANCE);
    }
}
