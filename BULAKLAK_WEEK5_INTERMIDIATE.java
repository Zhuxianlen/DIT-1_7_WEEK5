package bulaklak_week5_intermidiate;

public class BULAKLAK_WEEK5_INTERMIDIATE {
    public static void main(String[] args) {
         int[] scores = {83, 90, 78, 92, 88, 76, 95, 84};

        int flowersum = 0;
        int flowerhighest = scores[0];
        int flowerlowest = scores[0];

        for (int i = 0; i < scores.length; i++) {

            flowersum = flowersum + scores[i];

            if (scores[i] > flowerhighest) {
                flowerhighest = scores[i];
            }

            if (scores[i] < flowerlowest) {
                flowerlowest = scores[i];
            }
        }

        double flowerave = (double) flowersum / scores.length;

        System.out.println("Total Sum: " + flowersum);
        System.out.println("Average Score: " + flowerave);
        System.out.println("Highest Score: " + flowerhighest);
        System.out.println("Lowest Score: " + flowerlowest);
    }
    
}
