package server.task;

public class Server {
    public void processRequest(Request request){
        RequestProcessor rp = new RequestProcessor(request);
        Thread thread = new Thread(rp);
        thread.start();
    }
}

