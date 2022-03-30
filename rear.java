
    class rear implements Runnable{
        public void run()
        {
            System.out.println("hello india");

        }
        public static void main(String[]args)
        {
              rear b=new rear();
            Thread t1=new Thread(b);
            t1.start();
            Thread t2=new Thread(b);
            t2.start();
            Thread t3=new Thread(b);
            t3.start();
            Thread t4=new Thread(b);
            t4.start();
            Thread t5=new Thread(b);
            t5.start();




        }
    }

