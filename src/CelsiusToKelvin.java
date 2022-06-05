    public class CelsiusToKelvin implements Converter {
        Integer cel;
        Double kel;
        @Override
        public void convert() {
            System.out.println("Calculation formula C - K");
        }
        public CelsiusToKelvin() {
            convert();
            System.out.println("Convert celsius to kelvin");
        }

        public CelsiusToKelvin(Integer cel, Double kel) {
            this.cel = cel;
            this.kel = kel;
        }

    }