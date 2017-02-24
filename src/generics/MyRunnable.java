package generics;

public class MyRunnable implements Runnable {

    private String word;
    private long millis;

    public MyRunnable(String word, long millis) {
        this.word = word;
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(word);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                //nothing
            }
        }
    }
}
