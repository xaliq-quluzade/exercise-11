package Livelock;

public class Worker {
    private String name;
    private boolean workDone;

    public Worker(String name) {
        this.name = name;
        this.workDone = false;
    }

    public void doWork(Worker other) {
        while (!other.workDone) {
            System.out.println(name + " adli ishci ishini gormek ucun " + other.name + " adli ishcinin ishini bitirmesini gozleyir.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + ": adli ishcinin ishi bitdi.");
        workDone = true;
    }
}
