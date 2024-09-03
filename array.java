import java.util.Scanner;

class A {
     int[] arr;

     A(int[] arr) {
        this.arr = arr;
    }

    void rev() {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }

   void printArray() {
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] inputArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        A reverser = new A(inputArray);
        reverser.rev();
        reverser.printArray();

        scanner.close();
    }
}
