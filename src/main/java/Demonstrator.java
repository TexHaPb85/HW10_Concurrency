import server.task.MethodType;
import server.task.Request;
import server.task.Server;

public class Demonstrator {

    private static void testProcesingRequestByServer(Server server, MethodType methodType){
        for (int i = 0; i < 10; i++) {
            server.processRequest(new Request(methodType, "get method " + i));
        }
    }

    private static void demonstrateWorkOfServer() {
        Server server = new Server();
        testProcesingRequestByServer(server,MethodType.GET);
        testProcesingRequestByServer(server,MethodType.POST);
        testProcesingRequestByServer(server,MethodType.PUT);
        testProcesingRequestByServer(server,MethodType.DELETE);
    }


    public static void main(String[] args) {
        demonstrateWorkOfServer();
    }
}
