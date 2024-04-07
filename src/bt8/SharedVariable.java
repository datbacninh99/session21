package bt8;

class SharedVariable {
    private int value = 0;

    public synchronized void increment() {
        value++;
        System.out.println("Increased value: " + value);
    }

    public synchronized void decrement() {
        value--;
        System.out.println("Decreased value: " + value);
    }
}