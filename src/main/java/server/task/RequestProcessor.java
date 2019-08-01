package server.task;

public class RequestProcessor implements Runnable {

    private Request inputRequest;

    public RequestProcessor(Request inputRequest) {
        this.inputRequest = inputRequest;
    }

    private void processRequest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(inputRequest.getTypeOfRequest() + " request " + inputRequest.getRequest()
                    + "is processing in thread " + Thread.currentThread());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(inputRequest.getTypeOfRequest() + " request " + inputRequest.getRequest() + "is executed");
    }

    @Override
    public void run() {
        processRequest();
    }
}
