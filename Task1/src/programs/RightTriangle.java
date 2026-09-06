package programs;

public class RightTriangle {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {

                if (j < i) {
                    System.out.print("  ");   // Print spaces
                } else {
                    System.out.print("* ");   // Print stars
                }
            }
            System.out.println();
        }
    }
}