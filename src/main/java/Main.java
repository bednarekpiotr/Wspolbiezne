
/**
 * Created by apple on 12/11/2017.
 */
public class Main {
    public static void main(String[] args) {

        Library library = new LibraryWriterPriority ();

        for ( int i = 0; i < 10; i ++) {
             new Reader (String.format(" CZYTELNIK [%d] ", i), library ). start ();
             }

         for ( int i = 0; i < 10; i ++) {
             new Writer (String.format(" PISARZ [%d] ", i), library ). start ();
             }
    }
}
