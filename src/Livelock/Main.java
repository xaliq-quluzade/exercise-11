package Livelock;

public class Main {
    public static void main(String[] args) {
        // Her iki ishci oz ishlerini gormek ucun bir-birlerini gozleyir
        // ikisi de bir-birlerini gozlediyine gore hec bir ishci ishe bashlaya bilmir

        Worker worker1 = new Worker("Worker 1");
        Worker worker2 = new Worker("Worker 2");

        Thread thread1 = new Thread(() -> worker1.doWork(worker2));
        Thread thread2 = new Thread(() -> worker2.doWork(worker1));

        thread1.start();
        thread2.start();
    }

}
