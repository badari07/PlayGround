package pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Easy {
public static int num = 0;
    public static void main(String[] args) throws Exception {
        Lock lock = new ReentrantLock();

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (this) {
//                    for (int i = 0; i < 100; i++) {
//                        num += i;
//                    }
//                }
//            }
//        });

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        Thread t3 = new Thread( () -> {
            synchronized (Easy.class) {
                for (int i = 0; i < 100; i++) {
                    num += i;
                }
            }
        });



myThread t2 = new myThread();
        t2.start();
        t.start();

//
//
//
//        Thread t2 = new Thread(() -> {
//            synchronized (Easy.class) {
//                for (int i = 0; i < 100; i++) {
//                    num -= i;
//                }
//            }
//
//        });
//
//
//
//        t.start();
//        t2.start();
//
//        t.join();
//        t2.join();
//
//        System.out.println(num);
//

      ExecutorService es = Executors.newCachedThreadPool();

      Future<Void> f1 = es.submit(() -> {
             // synchronized (Easy.class) {
                  for (int i = 0; i < 100; i++) {
                      lock.lock();
                      num += i;
                      System.out.println("calling from addeer " + num);
                      lock.unlock();
                  }
            //  }
              return null;
          }
        );

        Future<Void> f2 = es.submit(() -> {
                  // synchronized (Easy.class) {
                        for (int i = 0; i < 100; i++) {
                            lock.lock();
                            num -= i;
                            System.out.println("calling from sub " + num);
                            lock.unlock();
                   //     }
                   }
                    return null;
                }
        );
      f1.get();
        f2.get();

        es.shutdown();
        System.out.println(num);
        gen.get2("badari");

        gen<Integer> g = new gen<>();
        Integer i = g.get(10);
        System.out.println(i);

        List<String> list = new ArrayList<>();
    }



}

class  gen<v> {
    public v get( v age) {
        return age;
    }

    public static <T> T get2(T name) {
        return name;
    }
}


class myThread extends Thread {
    public void run() {
        System.out.println("my thread");
    }
}




