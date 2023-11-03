package thread;

public class Main {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(new Consumer(sharedResource));
        Thread t2 = new Thread(new Producer(sharedResource));


        t1.start();
        t2.start();
    }
}
