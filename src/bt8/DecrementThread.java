package bt8;

class DecrementThread extends Thread {
    private SharedVariable sharedVariable;

    public DecrementThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    @Override
    public void run() {
        while (true) {
            sharedVariable.decrement();
            try {
                Thread.sleep(1000); // Chờ 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}