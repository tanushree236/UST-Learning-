public class Syncronization {
    static class Counter {
        int count;
        public void increment(){
            count++;
        }
    }
    public static void main(String[] args) {
        Counter c=new Counter();

        Thread t1=new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        t1.start();
        System.out.println("Count : "+c.count);

    }
}
