import firedepartment.task.Call;
import firedepartment.task.FireDepartment;
import server.task.MethodType;
import server.task.Request;
import server.task.Server;

public class Demonstrator {

    public static void demonstrateWorkOfServer() {
        Server server = new Server();
        for (int i = 0; i < 10; i++) {
            server.processRequest(new Request(MethodType.GET, "get method " + i));
        }
        for (int i = 0; i < 10; i++) {
            server.processRequest(new Request(MethodType.POST, "post method " + i));
        }
        for (int i = 0; i < 10; i++) {
            server.processRequest(new Request(MethodType.PUT, "put method " + i));
        }
        for (int i = 0; i < 10; i++) {
            server.processRequest(new Request(MethodType.DELETE, "delete method " + i));
        }
    }

    public static void demostrateWorkOfFireDepartment() {
        FireDepartment fd = new FireDepartment();

        for (int i = 0; i < 15; i++) {
            fd.respondNewCall(new Call("some street " + i));
        }
    }

    public static void main(String[] args) {
        //demonstrateWorkOfServer();
        demostrateWorkOfFireDepartment();
    }
}
