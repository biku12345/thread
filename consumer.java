package thread;

public class Consumer implements Runnable{
    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;

    }


    @Override
    public void run() {
        System.out.println("Consume started by --------->"+Thread.currentThread().getName());
        sharedResource.consumeItem();
    }
}
