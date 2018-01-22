
/**
 * Created by apple on 12/11/2017.
 */
public class Main {
    public static void main(String[] args) {

        Library library = new LibraryMonitor();

        for ( int i = 1; i < 10; i ++) {
             new Reader (String.format(" Czytelnik %d ", i), library ). start ();
             }

         for ( int i = 1; i < 10; i ++) {
             new Writer (String.format(" Pisarz %d ", i), library ). start ();
             }
    }
}
