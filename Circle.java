import java.util.Scanner;

class Circle {
    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        System.out.println("Enter Radius");
        Double radius = Values.nextDouble();

        Double Area = Math.PI * Math.pow(radius, 2);
        System.out.println("Your Circle Area is" + " " + Area);
    }
}
