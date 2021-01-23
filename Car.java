public class Car extends Vehicle {

    final static int PERMISSION_CUTOFF_YEAR = 1997;
    final static int PERMISSION_CUTOFF_MILEAGE = 300000;
    final static int MINIMUM_AGE_TO_DRIVE = 18;

    static Boolean isOperatorOfAge(Operator operator){
        return operator.getAge() > MINIMUM_AGE_TO_DRIVE;
    }

    private String model;
    private int capacity;

    public Car(Float mileage, int year, Operator operator, String model, int capacity){
        super(mileage, year, operator);
        initialize(model, year);
    }

    public Car(Usage usage, Float mileage, int year, Operator operator, String model, int capacity) {
        super(usage, mileage, year, operator);
        initialize(model, year);
    }

    private void initialize(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public Boolean isPermittedToOperate() {
        return !isTooOldToDrive() && !isMileageTooHigh() && isOperatorOfAge(operator);
    }

    @Override
    Boolean transferOperator(Operator newOperator) {
        if (isOperatorOfAge(newOperator) && isOperatorOfAge(operator)){
            operator = newOperator;
            return true;
        }
        return false;
    }

    @Override
    void run() {
        System.out.println("Car is running...");
    }

    private Boolean isTooOldToDrive(){
        return year < PERMISSION_CUTOFF_YEAR;
    }

    private Boolean isMileageTooHigh(){
        return mileage < PERMISSION_CUTOFF_MILEAGE;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
