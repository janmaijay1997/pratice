package org.example;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello world!");
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.speak();
        cat.speak();
        //BigDecimal f=.7;
        int a =129;
        char v=126;
        char f=1;
        Dog dog1=new Dog();
        System.out.println(dog1.test);

        byte b=(byte)a;
        System.out.println( b);
        User user1 = new User("A","B");

        User user2 = new User("C","D");

        User user3 = new User("A","B");

        Set<User> set = new HashSet<>();

        set.add(user1);

        set.add(user2);

        set.add(user3);
        String j = "df";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (j) { // Synchronize on 'j' object
                    try {
                        System.out.println("before waiting");
                        j.wait(); // Wait on the 'j' object
                        System.out.println("after waiting");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("after waiting check"+Thread.currentThread().getName());

            }
        });
        t1.start();


        DefaultMethodInteface1 testDefaultmethod=new TestDefaultmethod();
        System.out.println(testDefaultmethod.test(45));
        // testDefaultmethod.testfd();
        List<String> test=new ArrayList<>();
        test.add("dff");
        test.add("rttgdf");
        List<UserDetails> pq=new ArrayList();
        pq.add(new UserDetails("test",667,4l));
        pq.add(new UserDetails("sdcs",23,4l));
        pq.add(new UserDetails("asascasc",67,4l));
        pq.add(new UserDetails("#@@32cdsd",12,4l));
        pq.add(new UserDetails("CVDVd",4,4l));
        pq.add(new UserDetails("mkm,jk",66,4l));
        pq.add(new UserDetails("nhncv df ",57,4l));
        pq.add(new UserDetails("tnbnvb",100,4l));
        pq.add(new UserDetails("gnghv",6,4l));
        Queue<UserDetails> pqq=new PriorityQueue<>(pq);
        System.out.println("priority Queue-----------");
        while (!pqq.isEmpty()) {
            UserDetails d = pqq.poll(); // Remove the head element (sorted order)
            System.out.println(d.getId() + "  " + d.getName());
        }
       /* UserDetails[] userd = pq.toArray(new UserDetails[pq.size()]);
        Arrays.sort(userd);
        for (UserDetails d:userd
        ) {
            System.out.println(d.getId()+ "  "+ d.getName());
        }
        Comparator<UserDetails> userDetailsComparator= (z,g)->z.getName().compareTo(g.getName());
        Arrays.sort(userd,userDetailsComparator);
        for (UserDetails d:userd
             ) {
            System.out.println(d.getId()+ "  "+ d.getName());
        }*/


        testExe();
        df(test,ds->ds.add("added from lambda"));
        System.out.println(test);
        System.out.println(set);
        //System.out.println( f);
        TestClass testClass=new TestClass();
        // testClass.test();
        System.out.println(myCustomLogic());
      /*  System.out.println("Performance Comparison between ArrayList and LinkedList with 100,000 insertions");

        // Create an ArrayList and LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Measure performance for ArrayList
        long arrayListStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i); // Inserting at the end
        }
        long arrayListEndTime = System.nanoTime();
        long arrayListDuration = arrayListEndTime - arrayListStartTime;
        System.out.println("Time taken for ArrayList insertions: " + arrayListDuration / 1000000 + " ms");

        // Measure performance for LinkedList
        long linkedListStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i); // Inserting at the end
        }
        long linkedListEndTime = System.nanoTime();
        long linkedListDuration = linkedListEndTime - linkedListStartTime;
        System.out.println("Time taken for LinkedList insertions: " + linkedListDuration / 1000000 + " ms");

        // Measure memory usage for ArrayList
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Requesting garbage collection before memory measurement
        long memoryBeforeArrayList = runtime.totalMemory() - runtime.freeMemory();
        arrayList.clear(); // Remove elements to prevent memory interference
        long memoryAfterArrayList = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used by ArrayList: " + (memoryAfterArrayList-memoryBeforeArrayList) / 1024 + " KB");

        // Measure memory usage for LinkedList
        runtime.gc(); // Requesting garbage collection before memory measurement
        long memoryBeforeLinkedList = runtime.totalMemory() - runtime.freeMemory();
        linkedList.clear(); // Remove elements to prevent memory interference
        long memoryAfterLinkedList = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used by LinkedList: " + (memoryAfterLinkedList-memoryBeforeLinkedList) / 1024 + " KB");

        // Further Analysis: Insertions at the start of the lists
        arrayList.clear();
        linkedList.clear();

        System.out.println("\nInsertions at the start of the list:");

        // Measure performance for insertions at the start (ArrayList)
        arrayListStartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {  // Use smaller number due to expensive operation
            arrayList.add(0, i); // Inserting at the start
        }
        arrayListEndTime = System.nanoTime();
        arrayListDuration = arrayListEndTime - arrayListStartTime;
        System.out.println("Time taken for ArrayList insertions at the start: " + arrayListDuration / 1000000 + " ms");

        // Measure performance for insertions at the start (LinkedList)
        linkedListStartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, i); // Inserting at the start
        }
        linkedListEndTime = System.nanoTime();
        linkedListDuration = linkedListEndTime - linkedListStartTime;
        System.out.println("Time taken for LinkedList insertions at the start: " + linkedListDuration / 1000000 + " ms");

        // Further Analysis: Random access
        System.out.println("\nRandom access performance:");

        // Measure random access time for ArrayList
        arrayList.clear();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long randomAccessStartTime = System.nanoTime();
        arrayList.get(50000);  // Accessing middle element
        long randomAccessEndTime = System.nanoTime();
        long arrayListRandomAccessDuration = randomAccessEndTime - randomAccessStartTime;
        System.out.println("Time taken for ArrayList random access: " + arrayListRandomAccessDuration + " ns");

        // Measure random access time for LinkedList
        linkedList.clear();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        randomAccessStartTime = System.nanoTime();
        linkedList.get(50000);  // Accessing middle element
        randomAccessEndTime = System.nanoTime();
        long linkedListRandomAccessDuration = randomAccessEndTime - randomAccessStartTime;
        System.out.println("Time taken for LinkedList random access: " + linkedListRandomAccessDuration + " ns");
        AtomicInteger a1= new AtomicInteger();
        AtomicInteger a2= new AtomicInteger();

        Runnable runnable= () -> {
            for (int i=1;i<=10;i++){
                a1.addAndGet(i);
            }
        };
        Runnable runnable1= () -> {
            for (int i=11;i<=20;i++){
                a2.addAndGet(i);
            }
        };

        Thread t1=new Thread(runnable );
        Thread t2 =new Thread(runnable1);
        t1.start();
        t2.start();
        System.out.println(a1+" first thread");
        System.out.println(a2+" secod thread");
        System.out.println(a1.get() + a2.get());
        System.gc();*/

    }
    static void  df(List a, Consumer<List<String>> con){
        con.accept(a);

    }
    public static String myCustomLogic(){
        try{
            return "Try Block";
        }catch(Exception e){
            return "Catch Block";
        }finally{
            return "Finally Block";
        }


    }

    public static void  testExe() throws ClassNotFoundException {
        System.out.println("d");
        throw new ClassNotFoundException();
    }
    public static void  testExeR() throws RuntimeException {
        System.out.println("d");
        throw new RuntimeException();
    }
    public void terd(){
        testExeR();
    }
}

class Vehicle {
    public void move() throws RuntimeException {
        System.out.println("The vehicle is moving");
    //throw  new IOException();
    }
}
class Car extends Vehicle {
    @Override
    public void move() {
        //super.move();
        System.out.println("The car is moving");
    }
    static void  test(){
        Vehicle v= new Vehicle();
        v.move();
    }
}