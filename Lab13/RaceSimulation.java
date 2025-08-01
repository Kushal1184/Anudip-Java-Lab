public class RaceSimulation {

    static class Racer extends Thread {
        private final int iterations;

        Racer(String name, int priority, int iterations) {
            super(name);
            setPriority(priority);
            this.iterations = iterations;
        }

        @Override
        public void run() {
            for (int i = 1; i <= iterations; i++) {
                System.out.println(getName() + " - iteration " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(getName() + " interrupted.");
                }
            }
            System.out.println(getName() + " finished.");
        }
    }

    public static void main(String[] args) {
        Racer t1 = new Racer("Runner‑A", Thread.MIN_PRIORITY, 10);
        Racer t2 = new Racer("Runner‑B", Thread.NORM_PRIORITY, 10);
        Racer t3 = new Racer("Runner‑C", Thread.MAX_PRIORITY, 10);

        t1.start();
        t2.start();
        t3.start();
    }
}
