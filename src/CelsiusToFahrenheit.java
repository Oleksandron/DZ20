    public  class CelsiusToFahrenheit implements Converter {
    Integer cel;
    Float far;

    @Override
        public void convert() {
            System.out.println("Calculation formula C * 9 / 5 + 32");
        }

    CelsiusToFahrenheit(){
        convert();
        System.out.println("Convert celsius to fahrenheit");
    }
    CelsiusToFahrenheit(Integer cel,Float far){
        this.cel = cel;
        this.far = far;
    }
}
