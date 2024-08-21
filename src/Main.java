public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        int myBmi = service.calculate(72, 1.7);
        System.out.println(" Ваш индекс BMI равен: " + myBmi);
    }
}
