/**
 * Created by apple on 12/11/2017.
 */

public class Reader extends Thread {
    private Library library;

    Reader(String name, Library lib) {
        super(name);
        this.library = lib;
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(getName() + " chce czytać " + i + " raz");
            library.startReading();
            try {
                System.out.println(getName() + " czyta "  + i + " raz");
                Thread.sleep((int) (Math.random() * 1000));

            } catch (InterruptedException e) {
            }
            System.out.println(getName() + " skończył czytać "  + i + " raz");
            library.endReading();
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
}