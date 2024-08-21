public class BmiService {

    public int calculate(int weightKg, double heightMetre) {

        return (int) (weightKg / heightMetre / heightMetre);
    }

}
