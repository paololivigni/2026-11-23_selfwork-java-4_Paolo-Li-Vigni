public class Car {
    
    private String brand;
    private String model;
    private String licensePlate;

    public Car(String brand, String model, String licensePlate){

        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;

    }
    

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    
}
