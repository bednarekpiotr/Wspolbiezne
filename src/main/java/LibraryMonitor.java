public class LibraryMonitor implements Library {

    private int readers = 0;
    private int writers = 0;
    private int waitingWriters = 0;

    synchronized public void startReading() {
        while (writers > 0 || waitingWriters > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        readers++;
    }

    synchronized public void endReading() {
        readers--;
        notifyAll();
    }

    synchronized public void startWriting() {
        waitingWriters++;
        while (readers > 0 || writers > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        waitingWriters--;
        writers++;
    }

    synchronized public void endWriting() {
        writers--;
        notifyAll();
    }
}
