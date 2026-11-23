import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);


        //  Creazione Map veicoli
        Map<String,Car> carsMap = new HashMap<>();

        carsMap.put("CJ220FA", new Car("Porsche", "987s", "CJ220FA"));
        carsMap.put("CJ120DM", new Car("Lancia", "Thema", "CJ120DM"));
        carsMap.put("FA110NA", new Car("Audi", "A6", "FA110NA"));
        carsMap.put("CO678FA", new Car("Bmw", "330i", "CO678FA"));
        carsMap.put("DC419NF", new Car("Mercedes", "SLS", "DC419NF"));


        //  Sistema di ricerca targa -> veicolo
        System.out.println("Inserisci il valore di ricerca: ");
        String licensePlateSearched = input.nextLine();
        Car found = carsMap.get(licensePlateSearched);


        //  
        if(found != null){

            System.out.println("Veicolo trovato:");
            System.out.println("Marca: " + found.getBrand());
            System.out.println("Modello: " + found.getModel());
            System.out.println("Targa: " + found.getLicensePlate());

        } else {
            System.out.println("Nessuna auto trovata con targa " + licensePlateSearched);
        }

        input.close();

    }
}
