import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> mails = new ArrayList<String>();

                mails.add("danielerossi@gmail.com");
                mails.add("antonioneri@gmail.com");
                mails.add("martabianchi@gmail.com");
                mails.add("danielerossi@gmail.com");
                mails.add("edoardobianchi@gmail.com");
                mails.add("leonardoviola@gmail.com");
                mails.add("antonioneri@gmail.com");

                
                System.out.println("Lista principale: " + mails);
        
                 Set<String> noDuplicateMails = new TreeSet<>(mails);
                List<String> noDuplicateListMails = new ArrayList<>(noDuplicateMails);
                System.out.println("Lista senza duplicati:\n" + noDuplicateListMails);

        }
}


