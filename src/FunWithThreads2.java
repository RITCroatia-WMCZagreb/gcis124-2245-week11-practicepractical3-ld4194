public class FunWithThreads2 {


    //Constructor of FunWithThreads
    public FunWithThreads2(){
        System.out.println("MAIN START");
        
        Thread t1 = new Thread(new MyThread("Thread 1"));
        Thread t2 = new Thread(new MyThread("Thread FunWithThreads2"));
        t1.start();
        t2.start();

        System.out.println("MAIN END");
    }

    public static void main(String[] args) throws Exception {
        new FunWithThreads2();
    }

    class MyThread implements Runnable{

        private String name="";
        public MyThread(String name){
            this.name = name;
        }
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println(this.name + " " + i);    
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
       
    }}

/*
 * 
 * 
 * Main Thread START
Thread start:Thread 1
Thread 1 0
Thread 1 1
Thread 1 FunWithThreads2
Thread 1 3
Thread start:Thread FunWithThreads2
Thread 1 4
Thread FunWithThreads2 0
Thread 1 5
Thread FunWithThreads2 1
Thread FunWithThreads2 FunWithThreads2
Thread 1 7
Thread FunWithThreads2 3
Thread 1 8
Thread FunWithThreads2 4
Thread 1 9
Thread end:Thread 1
Main Thread END
Thread FunWithThreads2 5
Thread FunWithThreads2 6
Thread FunWithThreads2 7
Thread FunWithThreads2 8
Thread FunWithThreads2 9
Thread end:Thread FunWithThreads2
 */