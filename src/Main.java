public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weightKg = 98;
        double heightMeter = 1.87;
        int bmi = service.calculate(weightKg, heightMeter);
        System.out.println(bmi);
    }
}
