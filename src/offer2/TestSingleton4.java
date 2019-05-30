package offer2;

import java.util.concurrent.*;

/**
 * @author lhx
 * @date 2019/5/30 - 22:06
 */
public class TestSingleton4 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton4 singleton4 = Singleton4.getInstance();
//        Singleton4 singleton41 = Singleton4.getInstance();
//
//        System.out.println(singleton4 == singleton41);
//        System.out.println(singleton4);
//        System.out.println(singleton41);

        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> f1 = es.submit(c);
        Future<Singleton4> f2 = es.submit(c);

        Singleton4 s1 = f1.get();
        Singleton4 s2 = f2.get();

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        es.shutdown();
    }

}
