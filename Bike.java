public class Bike extends Vehicle {

    final static int MINIMUM_AGE_TO_RIDE_WITHOUT_TRAINING_WHEELS = 6;

    static Boolean canRideWithoutTrainingWheels(Operator operator){
        return operator.getAge() > MINIMUM_AGE_TO_RIDE_WITHOUT_TRAINING_WHEELS;
    }

    private Boolean hasTrainingWheels;

    public Bike(Float mileage, int year, Operator operator, Boolean hasTrainingWheels){
        super(mileage, year, operator);
        this.hasTrainingWheels = hasTrainingWheels;
    }

    @Override
    public Boolean isPermittedToOperate() {
        return !canRideWithoutTrainingWheels(operator) && hasTrainingWheels;
    }

    @Override
    Boolean transferOperator(Operator newOperator) {
        operator = newOperator;
        return true;
    }

    @Override
    void run() {
        System.out.println("Bike is running...");
    }

    public Boolean getHasTrainingWheels(){
        return hasTrainingWheels;
    }

    public void removeTrainingWheels() {
        hasTrainingWheels = false;
    }

    public void addTrainingWheels(){
        hasTrainingWheels = true;
    }
}
