public class TestStatistics {
    public static void main(String[] args) {
//    Create a Java application named test-statistics. Create an array of 10 test
//    scores. Print out the following statistics of your test scores:
// - average


//- high score
//- low score

        int[] scores = {50, 75, 100, 90, 0};
        int[] highLow = {50, 75, 100, 90, 0};
// copy from colors at subscript 1 to
// colorCopy at 0 -- move 2 elements
//                System.arraycopy(highScore, "100", lowScore, "0");
//                for (int i = 0; i <=5; i++) {
//                    System.out.println(highLow[i]);
//                }
        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            } else if (scores[i] > max) {
                max = scores[i];
            }
            System.out.println(highLow);
//    BONUS: Calculate and display the median value (what is the difference between the
//            average and the median).

        }
    }
}
