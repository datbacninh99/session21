package bt8;

class IncrementThread extends Thread {
    private SharedVariable sharedVariable;

    public IncrementThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    @Override
    public void run() {
        while (true) {
            sharedVariable.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}