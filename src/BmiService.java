public class BmiService {

    public int calculate(int weightKg, double heightMeter) {
        double bmi = weightKg / Math.pow(heightMeter, 2);
        return (int) bmi;
    }
}
