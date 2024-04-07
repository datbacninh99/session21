package bt7;

import java.util.Random;

class RandomNumberThread extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random Number: " + randomNumber);
    }
}