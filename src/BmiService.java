public class BmiService {
    double calculate(double height, double weight) {
        double result = weight / (height * height);
        return (int) result;
    }
}
