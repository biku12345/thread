package thread;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Items Added By ---->" + Thread.currentThread().getName()+ "Notify All other thread");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consumer method Invoked by ------------>"+ Thread.currentThread().getName());

        while (!itemAvailable) {

            try {
                System.out.println("Waiting now --------->"+ Thread.currentThread().getName());
                wait();
            }catch (Exception e) {

            }
        }
        itemAvailable=false;
        System.out.println("Consumed By ------>"+ Thread.currentThread().getName());

    }


}
