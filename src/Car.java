public class Car {
    private int engineSize;

    private String licensePlate;

    private String brand;

    private String model;

    public Car(int engineSize, String licensePlate, String brand, String model){
        this.engineSize = engineSize;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineSize=" + engineSize +
                ", licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
