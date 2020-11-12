import java.util.HashSet;

class TC02 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        coding coding1= new coding();
        Thread t1 =new Thread(coding1);
        Thread t2 = new Thread(String.valueOf(coding1.mod));
        Thread t3 = new Thread(String.valueOf(coding1.mod));
        Thread t4 = new Thread(String.valueOf(coding1.mod));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

}
class coding implements Runnable{
    int number;
    int Random;
    int mod;
    int min;
    int median;
    int total;
    @Override
    public void run() {
         Random = 0;
        System.out.println("Number Random From 100 and get 20 number:");
        for (int i = 0; i < 20; ++i) {
            Random = (int) (Math.random() * 100);

            System.out.println(Random);
            number += Random;


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nTotal Numbers =" + number);
        min = number / 20;
        System.out.println("Min = " + min);

        int q = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = Random - 1; i >= 0; i--) {

            if (set.contains(Random -1))
                q = i;

            else
                set.add(Random -1);
        }

        if (q != -1) {
            mod = Random -1;
            System.out.println("Mod = " + mod);
        } else
            System.out.println("Mod = There are no repeating elements");

        median = Random ;
        for (int i = 0; i < Random; i++) {
            if (Random > median) {
                median = Random-1 + Random - 2 / 2;
            }
        }
        System.out.println("Median = "+median);
         total= min + mod  + median;
        System.out.println("Total = "+total);


    }

}