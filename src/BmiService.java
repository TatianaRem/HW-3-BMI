public class BmiService {
    public double calculate(double bodyMass, double height) {
        double index = bodyMass / (height * height);
        return index;
    }

}
