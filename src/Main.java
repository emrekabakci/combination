import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined.
        int n, r, z,p=1,d=1,s=1,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 values for the combination calculation. C(n,r)");

        //Data retrieved from user.
        System.out.print("First value n : ");
        n = scanner.nextInt();

        System.out.print("Second value r :");
        r = scanner.nextInt();

        z = n - r;

        //Factorial calculated.
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

        //Result printed.
        System.out.print("C(n,r) = " + result);
    }
}