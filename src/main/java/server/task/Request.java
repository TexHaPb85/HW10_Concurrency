package server.task;

public class Request {
    private MethodType typeOfRequest;
    private String request;

    public Request(MethodType typeOfRequest, String request) {
        this.typeOfRequest = typeOfRequest;
        this.request = request;
    }

    public MethodType getTypeOfRequest() {
        return typeOfRequest;
    }

    public void setTypeOfRequest(MethodType typeOfRequest) {
        this.typeOfRequest = typeOfRequest;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
}
