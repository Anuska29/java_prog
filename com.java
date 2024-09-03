public class PrimeCounter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("insufficient arguments");
        } else {
            int start = Integer.parseInt(args[0]);
            int end = Integer.parseInt(args[1]);
            int count = 0;

            for (int i = start; i <= end; i++) {
                boolean isPrime = true;

                if (i <= 1) {
                    isPrime = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
