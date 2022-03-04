public class Nested {

    public static void main(String[] args) {

        int age = 25;
        if (age > 21) {
            if (age > 16) {
                System.out.println("Welcome");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }
    }
}
