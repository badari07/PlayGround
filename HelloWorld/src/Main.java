import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//            List<String> name = new ArrayList<>(Arrays.asList("bad", "raj"));
//
//            Stream<String> stm = name.stream();
//
//            System.out.println(stm.collect(Collectors.toList()));

//        myThread t1 = new myThread();
//        myThread t2 = new myThread();

        //myThread runable = new myThread();

//        Thread t1 = new Thread(new myThread(), "badari");
//
//       // Thread t1 = new Thread(new myThread(),"thread 1");
//        Thread t2 = new Thread(new myThread(),"new 2 thread");
//
//        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t2.start();
        //mythread2 newthread = new mythread2();


//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        Future<Integer> future1 = executorService.submit(new mythread2(10));
//        Future<Integer> future2 = executorService.submit(new mythread2(20));
//        Future<Integer> future3 = executorService.submit(new mythread2(30));
//
//       try {
//           System.out.println("result 1 : " + future1.get());
//           System.out.println("result 2 : " + future2.get());
//           System.out.println("result 3 : " + future3.get());
//       } catch (ExecutionException e) {
//           throw new RuntimeException(e);
//       } catch (InterruptedException e) {
//           throw new RuntimeException(e);
//       }finally {
//           executorService.shutdown();
//       }
//
//
//    }
//}
//
////class myThread extends Thread {
//class myThread implements Runnable {
//
//    public void run() {
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " " + Thread.currentThread().getName());
//        }
//
//    }
//}
//
//class mythread2 implements Callable<Integer> {
//
//    private int num;
//
//    public mythread2(int num){
//        this.num = num;
//    }
//
//    @Override
//    public Integer call() throws Exception {
////        for (int i = 0; i <= 5; i++) {
////            System.out.println(i + " " + Thread.currentThread().getName());
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                System.out.println(e);
////            }
////        }
////        return 14;
//
//        int result = num * num;
//        System.out.println(Thread.currentThread().getName() + "calculated" + result);
//        return result;
//   }

//        Given a positive sorted arraya = [ 3, 4, 6, 9, 10, 12, 14, 15, 17, 19, 21 ];
//        Define a function f(a, x) that returns x, the next smallest number, or -1 for errors.i.e.f(a, 12) = 12f(a, 13) = 12 f(a, 12) = 12
    // number foundf(a, 13) = 12
        // smaller number foundf(a, 2) = -1
        // out of bounds too smallf(a, 22) = 21
        // out of bounds too largef(a, 3) = 3
        // exact left boundaryf(a, 21) = 21
        // exact right boundaryf([], x) = -1
        // empty arrayf(null, x) = -1
        // invalid input

//        int[] a = {3, 4, 6, 9, 10, 122, 14, 15, 17, 19, 21};
//
//       System.out.println( f( a, 24));
//       System.out.println(f(a,-1));
//        System.out.println(f(a,13));


//        List<Integer> numbers = Arrays.asList(1, 5, 2, 3, 1, 8, 6, 5, 8);
//
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int num : numbers) {
//            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//        }
//
//        System.out.println(frequencyMap);
//
//        System.out.println("Numbers with frequency > 1:");
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
//            }
//        }
//
//        System.out.println(solve("1000010001111110"));
//
//        System.out.println(solve("00000011111111"));
        //printNumbersHelper(1, 9);

        List<Integer> num = List.of(1,2,3,4,0,9,10,8,7,6,5);

        List<Integer> num1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> even = num.stream().filter( n -> n % 2 == 0).map( n -> n + 'S').collect(Collectors.toList());

        Collections.sort(even);
        Collections.sort(num1);
        Collections.reverse(num1);
        System.out.println(even);
        System.out.println(num1);

        final int x = 10;




    }
//
//    public static int f(int[] a, int x) {
//        // Check for invalid input
//        if (a == null || a.length == 0) {
//            return -1;
//        }
//
//        // Initialize the result as -1 for out-of-bounds cases
//        int result = -1;
//
//        // Traverse the array
//        for (int num : a) {
//            if (num == x) {
//                return x; // Exact match found
//            }
//            if (num > x) {
//                return result; // Return the previous element if x is smaller than the current one
//            }
//            result = num; // Update result with the current element
//        }
//
//        // If loop ends and no match, return the last valid result or -1
//        return result;
//    }
//
//
//
//    public static void printNumbersHelper(int current, int A) {
//        if (current > A) {
//            return;
//        }
//        System.out.print(current + " ");
//        printNumbersHelper(current +1, A);
//    }




//    int [] arry = {5, 1, 4, 3, 6, 8, 10, 7, 9};
//
//     int n = arry.length;
//     int[] leftMx = new int[n];
//     int[] rightMin = new int [n];
//
//    leftMx[0] = arry[0];
//    for( int i =  1; i < n ; i++){
//        leftMx[i] = Math.max(leftMx[ i - 1], arry[i]);
//    }
//
//    rightMin[n -1] = arry[n-1];
//    for( int i = n -2; i >= 0; i--){
//        rightMin[i] = Math.min(rightMin[i + 1], arry[i]);
//    }
//
//    for( int i =1 ; i < n -1 ; i++){
//        if(arry[i] >leftMx[i] && arry[i] < rightMin[ i + 1] )
//            System.out.println("index is " + i);
//    }
//
//    //fill left max
//
//    leftMx[0] = arry[0];
//    for( int i =  1; i < n ; i++){
//        leftMx[i] = Math.max(leftMx[ i - 1], arry[i]);
//    }
//
//    //fill rightmin
//
//    rightMin[n -1] = arry[n-1];
//    for( int i = n -2; i >= 0; i--){
//        rightMin[i] = Math.min(rightMin[i + 1], arry[i]);
//    }
//
//    for( int i =1 ; i < n -1 ; i++){
//        if(arry[i] >leftMx[i] && arry[i] < rightMin[ i + 1] )
//    }






//String input = "abc0123dfdf4456789hfhf";
//
//    Set<Character> set = new HashSet<>();
//
//    for(char c : input.tocharArray()){
//        if(Character.isDigit(c)){
//            set.add(c);
//        }
//    }
//
//    List<Character> list = new ArrayList<>(set);
//
//    List<Character> ood = list.stream().filter(c -> c % 2 !=0).collect(Collectors.toList());




//    List<Integer> numbers = Arrays.asList(1, 5, 2, 3, 1, 5, 8, 6, 5, 8, 8);
//
//    Map<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int num : numbers) {
//        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//    }

}