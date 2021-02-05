public abstract class Vehicle implements Permitted {

    protected Usage usage;
    protected Float mileage;
    protected int year;
    protected Operator operator;

    public Vehicle(Float mileage, int year, Operator operator) {
        this.usage = Usage.DOMESTIC;
        this.mileage = mileage;
        this.year = year;
        this.operator = operator;
    }

    public Vehicle(Usage usage, Float mileage, int year, Operator operator){
        this.usage = usage;
        this.mileage = mileage;
        this.year = year;
        this.operator = operator;
    }

    public Usage getUsage() {
        return usage;
    }

    public Float getMileage() {
        return mileage;
    }

    public int getYear() {
        return year;
    }

    abstract Boolean transferOperator(Operator newOperator);

    abstract void run();

    private void backgroundCheck(Operator operator){
        System.out.println("Checking records...");
    }

    enum Usage {
        DOMESTIC, COMMERCIAL
    }
}
