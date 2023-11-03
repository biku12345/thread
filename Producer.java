package thread;

public class Producer implements Runnable{

    SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;

    }



    @Override
    public void run() {

        System.out.println("Producer Thread ------->"+ Thread.currentThread().getName());

        try {
            Thread.sleep(5000);



        }catch (Exception e) {

        }
        sharedResource.addItem();

    }
}
