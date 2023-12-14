package StreamAPi;

public class ThreadClassExample {
    public static void main(String[] args) {

        Runnable run1=()->{

          for(int i=0; i<10;i++){
              System.out.println("THread1"+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }
          }
        };
        Runnable run2=()->{
          for (int j=0;j<5;j++){
              System.out.println("Thread222222222"+j);
              try {
                  Thread.sleep(2000);
              } catch (Exception e){
                  System.out.println(e);
              }
          }

        };

        Thread t1=new Thread(run1);
        Thread t2=new Thread(run2);
        t1.start();
        t2.start();


    }
}
