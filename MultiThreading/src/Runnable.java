public class Runnable {
    static class Hi implements java.lang.Runnable {
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }
    }
    static class Hello implements java.lang.Runnable{
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        java.lang.Runnable obj1=new Main.Hi();
        java.lang.Runnable obj2=new Main.Hello();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception e){}
        t2.start();

//        System.out.println(t1.getName());
//        System.out.println(t2.getName());

        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority()); // Ranges from 1- 10, 1- most Priority and 10- Least Priority 5, normal
        System.out.println(t2.getPriority());

        t1.join();
        t2.join();
        System.out.println("Bye");

    }
}
