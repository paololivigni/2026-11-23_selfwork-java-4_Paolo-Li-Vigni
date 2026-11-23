import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        Map<String, Student> students = new HashMap<>();

        //  Input dei valori
        System.out.print("Matricola: ");
        String studentId = input.nextLine();

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Età: ");
        int eta = input.nextInt();
        input.nextLine(); // svuota il buffer dopo nextInt()

        //  Creazione oggetto e lo aggiungo alla mappa
        Student s = new Student(nome, eta);
        students.put(studentId, s);
        System.out.println("Aggiunto: " + students.get(studentId));

        //  Rimozione oggetto
        Student removed = students.remove(studentId);
        if (removed != null) {
            System.out.println("Rimosso: " + removed);
        } else {
            System.out.println("Nessun oggetto da rimuovere.");
        }

        //  Ricerca dell'oggetto
        if (students.containsKey(studentId)) {
            System.out.println("Trovato: " + students.get(studentId));
        } else {
            System.out.println("Matricola " + studentId + " non trovata.");
        }

        input.close();
    }
}
