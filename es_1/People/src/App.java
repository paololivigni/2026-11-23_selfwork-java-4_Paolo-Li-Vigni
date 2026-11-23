import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Dodge", "Viper RT/10", 1992, "USA"));
        cars.add(new Car("Toyota", "Supra", 1995, "JPN"));
        cars.add(new Car("Honda", "NSX", 1990, "JPN"));
        cars.add(new Car("Chevrolet", "Camaro", 1990, "USA"));
        cars.add(new Car("Subaru", "Impreza", 1992, "JPN"));
        cars.add(new Car("Mazda", "Rx-7", 1989, "JPN"));
        cars.add(new Car("Nissan", "R33", 1995, "JPN"));
        cars.add(new Car("Aston Martin", "DB7", 1993, "UK"));
        cars.add(new Car("TVR", "Griffith", 1991, "UK"));

        List<Car> jpnCars = new ArrayList<Car>();
        
        for(Car car : cars){
            if(car.getNationality() == "USA"){
                jpnCars.add(car);
            }
        }

        System.out.println("Filtro auto USA:");
        for (Car car : jpnCars){
            System.out.println(car.getBrand() + " " + car.getModel() + " - " + car.getYear() + " - " + car.getNationality());
        }
    }
    
}
