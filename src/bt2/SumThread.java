package bt2;

public class SumThread extends Thread {
    private long sum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sum += i;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tổng các số từ 1 đến 1000 là: " + sum);
    }

    public static void main(String[] args) {
        new SumThread().start();
    }
}