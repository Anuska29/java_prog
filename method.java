import java.util.*;

class Fibo extends Thread {
    int n;
    Fibo(int n) {
        this.n = n;
    }
    public void run() {
        int x = 0, y = 1;
        try {
            for (int i = 1; i <= n; i++) {
                System.out.println("Fibo: " + x);
                Thread.sleep(500);
                x = x + y;
                y = x - y;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Prime extends Thread {
    int n;
    Prime(int n) {
        this.n = n;
    }
    public void run() {
        try {
            int count = 0, num = 2;
            while (count < n) {
                if (isPrime(num)) {
                    System.out.println("Prime: " + num);
                    count++;
                }
                num++;
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        Fibo t1 = new Fibo(n);
        Prime t2 = new Prime(n);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
