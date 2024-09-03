import java.util.Scanner;
class notpali extends Exception {
    public notpali(String text) {
        super(text);
    }
}

public class checkpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String data = sc.nextLine();

        try {
            pal(data);
        } catch (notpali e) {
            System.out.println(e.getMessage());
        }
    }

    static void pal(String str) throws notpali {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                throw new notpali("The string is not a palindrome.");
            }
        }
        System.out.println(1);
    }
}
