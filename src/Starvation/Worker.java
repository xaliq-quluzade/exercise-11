package Starvation;

public class Worker extends Thread {
    private Computer computer;
    private String name;

    public Worker(Computer computer, String name) {
        this.computer = computer;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            computer.useComputer(name);
        }
    }
}
