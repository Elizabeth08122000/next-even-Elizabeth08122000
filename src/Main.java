import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        System.out.println(A+(2-(A%2)));
        in.close();
    }
}
