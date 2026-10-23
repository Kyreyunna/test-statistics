public class TestStatistics {
    public static void main(String[] args) {
//    Create a Java application named test-statistics. Create an array of 10 test
//    scores. Print out the following statistics of your test scores:
// - average


//- high score
//- low score

                String[] colors = {"red", "white", "blue"};
                String[] colorCopy = new String[3];
// copy from colors at subscript 1 to
// colorCopy at 0 -- move 2 elements
                System.arraycopy(colors, 1, colorCopy, 0, 2);
                for (int i = 0; i < 2; i++) {
                    System.out.println(colorCopy[i]);
                }

//    BONUS: Calculate and display the median value (what is the difference between the
//            average and the median).

    }
}
