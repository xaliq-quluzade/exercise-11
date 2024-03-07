package Starvation;

public class Main {
    public static void main(String[] args) {
        // ish yerinde cemi 1 komputer var
        // Bir ishci komputerle dayanmadan ishlediyine gore diger ishci ishleye bilmir

        Computer computer = new Computer();

        Worker worker1 = new Worker(computer, "Worker 1");
        Worker worker2 = new Worker(computer, "Worker 2");

        worker1.start();
        worker2.start();
    }
}
