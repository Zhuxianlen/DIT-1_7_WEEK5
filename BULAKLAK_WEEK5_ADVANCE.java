package bulaklak_week5_advance;
import java.util.Arrays;
public class BULAKLAK_WEEK5_ADVANCE {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88, 76, 95, 84};

        int target = 92;
        int index = -1;

        // Linear search
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Target Score: " + target);
            System.out.println("Score found at index: " + index);
        } else {
            System.out.println("Target Score: " + target);
            System.out.println("Score not found.");
        }

        // Sort a copy to preserve the original order of the scores.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Scores: " + Arrays.toString(scores));
        System.out.println("Sorted Scores: " + Arrays.toString(sortedScores));
    }
    
}
