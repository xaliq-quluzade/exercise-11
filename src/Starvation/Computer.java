package Starvation;

public class Computer {
    public synchronized void useComputer(String name) {
        System.out.println(name + " adli ishci komputerde ish gorur");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " ishini bitirdi");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
