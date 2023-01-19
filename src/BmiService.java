public class BmiService {
    public double calculate(double bodyMass) {
        double height = 1.7;
        double index = bodyMass / (height * height);
        return index;
    }

}
