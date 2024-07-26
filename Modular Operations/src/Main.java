import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Hello Everyone");
            System.out.println("********* Menu **********");
            System.out.println("Option 1: Modulo Operations");
            System.out.println("Option 2: Modulo Exponential");
            System.out.println("Option 3: Modulo Inverse");
            System.out.println("Option 4: Modulo Addition");
            System.out.println("Option 5: Modulo Subtraction");
            System.out.println("Option 6: Modulo Multiplication");
            System.out.println("Option 7: Exit");
            System.out.println("Enter the option:");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the value of a: ");
                    int a = sc.nextInt();
                    System.out.println("Enter the value of m: ");
                    int m = sc.nextInt();
                    ModuloOperation(a, m);
                    break;
                case 2:
                    System.out.println("Enter the value of a: ");
                    a = sc.nextInt();
                    System.out.println("Enter the value of exponent: ");
                    int e = sc.nextInt();
                    System.out.println("Enter the value of m: ");
                    m = sc.nextInt();
                    ModuloExponential(a, e, m);
                    break;
                case 3:
                    System.out.println("Enter the value of a: ");
                    a = sc.nextInt();
                    System.out.println("Enter the value of m: ");
                    m = sc.nextInt();
                    ModuloInverse(a, m);
                    break;
                case 4:
                    System.out.println("Enter the value of a: ");
                    a = sc.nextInt();
                    System.out.println("Enter the value of b: ");
                    int b = sc.nextInt();
                    System.out.println("Enter the value of m: ");
                    m = sc.nextInt();
                    ModuloAddition(a, b, m);
                    break;
                case 5:
                    System.out.println("Enter the value of a: ");
                    a = sc.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = sc.nextInt();
                    System.out.println("Enter the value of m: ");
                    m = sc.nextInt();
                    ModuloSubtraction(a, b, m);
                    break;
                case 6:
                    System.out.println("Enter the value of a: ");
                    a = sc.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = sc.nextInt();
                    System.out.println("Enter the value of m: ");
                    m = sc.nextInt();
                    ModuloMultiplication(a, b, m);
                    break;
                case 7:
                    sc.close();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    public static void ModuloOperation(int a, int m) {
        if (m == 0) {
            System.out.println("Modulo by zero is not defined.");
        } else {
            int r = a % m;
            if (r < 0) r += m; // to handle negative remainders
            System.out.println(a + " mod " + m + " = " + r);
        }
    }

    public static void ModuloExponential(int a, int e, int m) {
        if (m == 0) {
            System.out.println("Modulo by zero is not defined.");
        } else {
            int r = 1;
            a = a % m;
            while (e > 0) {
                if ((e & 1) == 1) {
                    r = (r * a) % m;
                }
                e = e >> 1;
                a = (a * a) % m;
            }
            System.out.println("Result: " + r);
        }
    }

    public static void ModuloInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1) {
            System.out.println("Inverse doesn't exist.");
            return;
        }

        if (gcd(a, m) != 1) {
            System.out.println("Inverse doesn't exist as " + a + " and " + m + " are not coprime.");
            return;
        }

        while (a > 1) {
            q = a / m;
            t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0) {
            x1 += m0;
        }

        System.out.println("Modular inverse is " + x1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void ModuloAddition(int a, int b, int m) {
        if (m == 0) {
            System.out.println("Modulo by zero is not defined.");
        } else {
            int r = (a + b) % m;
            if (r < 0) r += m; // to handle negative results
            System.out.println("Result: " + r);
        }
    }

    public static void ModuloSubtraction(int a, int b, int m) {
        if (m == 0) {
            System.out.println("Modulo by zero is not defined.");
        } else {
            int r = (a - b) % m;
            if (r < 0) r += m; // to handle negative results
            System.out.println("Result: " + r);
        }
    }

    public static void ModuloMultiplication(int a, int b, int m) {
        if (m == 0) {
            System.out.println("Modulo by zero is not defined.");
        } else {
            int r = (a * b) % m;
            if (r < 0) r += m; // to handle negative results
            System.out.println("Result: " + r);
        }
    }
}
