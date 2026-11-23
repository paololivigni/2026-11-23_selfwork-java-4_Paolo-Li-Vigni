import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        //  Creazione ArrayList
        List<Person> people = new ArrayList<Person>();

        //  Aggiunzione elementi ArrayList
        people.add(new Person(0, "Daniele", "Rossi", 36, "Roma"));
        people.add(new Person(1, "Antonio", "Bianchi", 32, "Bergamo"));
        people.add(new Person(2, "Leonardo", "Verdi", 30, "Palermo"));
        people.add(new Person(3, "Ciro", "Esposito", 38, "Napoli"));
        people.add(new Person(4, "Marta", "Neri", 37, "Palermo"));
        people.add(new Person(5, "Anna", "Viola", 33, "Sassari"));

        //  Iterazione ArrayList
        for (Person person : people){
            System.out.println(person.getIndex() + " " + person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getCity());
        }

        // Comando input utente
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la posizione della persona da modificare: ");
        int index = input.nextInt();
        input.nextLine();

        // Check inserimento valore indice
        if(index >= 0 && index < people.size()-1){
            
            //  Input dati nuova persona
            Person updatablePerson = people.get(index);
            System.out.println("La persona selezionata è " + updatablePerson.getName() + " " + updatablePerson.getSurname() + " " + updatablePerson.getAge() + " " + updatablePerson.getCity());
            System.err.println("Inserisci il nuovo nome:");
            String updateName = input.nextLine();
            System.out.println("Inserisci il nuovo cognome:");
            String updateSurname = input.nextLine();
            System.out.println("Inserisci la nuova età:");
            Integer updateAge = input.nextInt();
            input.nextLine();
            System.out.println("Inserisci la nuova città:");
            String updateCity = input.nextLine();

            // Sovrascrittura dati nuova persona su persona selezionata
            updatablePerson.setName(updateName);
            updatablePerson.setSurname(updateSurname);
            updatablePerson.setAge(updateAge);
            updatablePerson.setCity(updateCity);

            //  Stampa nuova lista (aggiornata)
            System.out.println("Persona aggiornata. La nuova lista è:");
            for (Person person : people){
                System.out.println(person.getIndex() + " " + person.getName() + " " + person.getSurname() + " " + person.getAge() + " " + person.getCity());
            }

        } else {
            
            System.out.println("Il valore inserito non è valido.");
        }

        input.close();

    }
}
