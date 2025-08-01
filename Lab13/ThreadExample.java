public class ThreadExample {

    static class AverageThread extends Thread {
        public void run() {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            double avg = sum / 10.0;
            System.out.println("Average of first 10 numbers is: " + avg);
        }
    }

    static class SquareThread extends Thread {
        int[] arr = {1, 20, 50, 15, 30};

        public void run() {
            System.out.println("Squares of array elements:");
            for (int num : arr) {
                System.out.println(num + "^2 = " + (num * num));
            }
        }
    }

    public static void main(String[] args) {
        AverageThread avgThread = new AverageThread();
        SquareThread squareThread = new SquareThread();

        avgThread.start();
        while (avgThread.isAlive()) { }
        squareThread.start();
    }
}
