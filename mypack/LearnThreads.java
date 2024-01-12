package mypack;

public class LearnThreads{
    abstract static class TestThread extends Thread {
        abstract public void testThread();
        abstract public void run();
        public TestThread(){
            CommonUtils.printSection("Threads");
        } 
    }

    public static class UnpredictableThread extends TestThread{
        public static int amount = 0;
        public void run(){
            amount ++;
        };
        public void testThread(){
            UnpredictableThread threadNono = new UnpredictableThread();
            threadNono.start();
            System.out.println("UnpredictableThread: Amount1:"+amount);
            amount ++;
            System.out.println("UnpredictableThread: Amount2:"+amount);
        };
    }

    public static class PredictableThread extends TestThread{
        public static int amount = 0;
        public void run(){
            amount ++;
        };
        public void testThread(){
            PredictableThread threadGood = new PredictableThread();
            threadGood.start();
            while (threadGood.isAlive()){
                System.out.println("Wating...");
            }
            System.out.println("PredictableThread: Amount1:"+amount);
            amount ++;
            System.out.println("PredictableThread: Amount2:"+amount);
        };
    }
}
