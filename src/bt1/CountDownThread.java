package bt1;

public class CountDownThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Đếm thời gian đã kết thúc!");
    }

    public static void main(String[] args) {
        new CountDownThread().start();
    }
}