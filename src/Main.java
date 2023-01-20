public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double bodyMass = 55;
            double height = 1.7;
            double index = service.calculate(bodyMass, height);
            System.out.println(index);
        }
    }