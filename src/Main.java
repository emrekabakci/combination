import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, z,p=1,d=1,s=1,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 values for the combination calculation. C(n,r)");

        System.out.print("First value c : ");
        n = scanner.nextInt();

        System.out.print("Second value r :");
        r = scanner.nextInt();

        z = n - r;

        for (int i = 1; i <= n; i++) {
            p=p*i;
        }System.out.println("n! ="+p);

        for (int e = 1; e <= r; e++) {
            d =d* e;
        }System.out.println("r! ="+d);

        for (int a = 1; a <= z; a++) {
            s =s* a;
        }
        result = p/(d*s);
        System.out.print("C(n,r) = " + result);
    }
}