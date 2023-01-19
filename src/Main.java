public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double bodyMass = 55;
            double index = service.calculate(bodyMass);
            System.out.println(index);
        }
    }