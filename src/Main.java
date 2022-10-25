import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayı:");
        x = input.nextInt();

        System.out.print("İkinci Sayı:");
        y = input.nextInt();

        System.out.print("Üçüncü Sayı:");
        z = input.nextInt();

        if (x > y) {
            if (x > z && y > z) {
                System.out.println("x>y>z");
            } else if (x > z && z > y) {
                System.out.println("x>z>y");
            }
        } else if (y > z) {
            if (y > x && x > z) {
                System.out.println("y>x>z");
            } else if (y > x && z > x) {
                System.out.println("y>z>x");
            }
        } else if (z > x) {
            if (z > y && y > x) {
                System.out.println("z>y>x");
            } else if (z > y && x > y) {
                System.out.println("z>x>y");
            }
        }


        if (x == y) {
            if (y > z) {
                System.out.println("x=y>z");
            } else if (z > y) {
                System.out.println("z>y=x");
            }
        } else if (y == z) {
            if (y > x) {
                System.out.println("y=z>x");
            } else if (x > y) {
                System.out.println("x>y=z");
            }
        } else if (z == x) {
            if (z > y) {
                System.out.println("z=x>y");
            } else if (y > z) {
                System.out.println("y>z=x");
            }

        }


        if ((x==y)&&(y==z)) {
            System.out.println("x=y=z");
        }
    }
}
