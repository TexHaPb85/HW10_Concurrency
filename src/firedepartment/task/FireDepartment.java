package firedepartment.task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class FireDepartment {
    private Fireman[] firemenStuff;
    private Queue<Call> callQueue;

    public FireDepartment() {
        this.firemenStuff = new Fireman[10];
        for (int i = 0; i < firemenStuff.length; i++) {
            firemenStuff[i] = new Fireman("Fireman" + i);
        }
        callQueue = new LinkedList<>();
    }

    public boolean getNewCall(Call call) {
        for (Fireman fireman : firemenStuff) {
            if (fireman.isFree()) {
                fireman.setFree(false);
                fireman.setCall(call);
                Thread thread = new Thread(fireman);
                thread.start();
                return true;
            }
        }
        callQueue.add(call);
        checkCallQueue();
        return false;
    }

    private boolean haveFreeFireman(){
        return Stream.of(firemenStuff).anyMatch(Fireman::isFree);
    }

    private void checkCallQueue(){
        while (!callQueue.isEmpty()){
            if(haveFreeFireman()){
                getNewCall(callQueue.remove());
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
