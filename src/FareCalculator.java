public class FareCalculator {

    /**
     * Delhi Metro fare slabs (approximate, as of 2024).
     */
    public static int calculateFare(int distanceKm) {
        if (distanceKm <= 2)  return 10;
        if (distanceKm <= 5)  return 20;
        if (distanceKm <= 12) return 30;
        if (distanceKm <= 21) return 40;
        if (distanceKm <= 32) return 50;
        return 60;
    }
}
