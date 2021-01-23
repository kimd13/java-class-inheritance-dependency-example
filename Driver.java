public class Driver {
    public static void main(String[] args) {

        Operator operator = givenOperator();
        Car operatorCar = givenCar(operator);
        Bike operatorBike = givenBike(operator);

        operatorBike.run();
        operatorCar.run();
    }

    private static Operator givenOperator(){
        int operatorAge = 21;
        return new Operator(operatorAge);
    }

    private static Car givenCar(Operator ofOperator){
        Vehicle.Usage carUsagePurpose = Vehicle.Usage.COMMERCIAL;
        Float carMileage = 100000F;
        int carYear = 2000;
        String carModel = "TSLA";
        int carCapacity = 5;
        return new Car(carUsagePurpose, carMileage, carYear, ofOperator, carModel, carCapacity);
    }

    private static Bike givenBike(Operator ofOperator){
        Float bikeMileage = 100F;
        int bikeYear = 2;
        Boolean bikeHasTrainingWheels = false;
        return new Bike(bikeMileage, bikeYear, ofOperator, bikeHasTrainingWheels);
    }
}
