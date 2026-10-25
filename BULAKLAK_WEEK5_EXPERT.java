
package bulaklak_week5_expert;

class FlowerStudents {

    String name;
    int[] flowerQuiz;

    FlowerStudents(String flowername, int[] quizzes) {
        this.name = flowername;
        this.flowerQuiz = quizzes;
    }

    double getAverage() {
        int flowerTotal = 0;

        for (int i = 0; i < flowerQuiz.length; i++) {
            flowerTotal += flowerQuiz[i];
        }

        return (double) flowerTotal / flowerQuiz.length;
    }
}

public class BULAKLAK_WEEK5_EXPERT {

    public static void main(String[] args) {

        String[][] data = {
            {"John Mark", "85", "90", "88", "92"},
            {"Jeanneus", "95", "90", "94", "93"},
            {"Lenard", "80", "85", "82", "83"},
            {"Elwin", "95", "90", "94", "93"},
            {"Jasper", "88", "86", "90", "84"}
        };

        FlowerStudents[] FStudents = new FlowerStudents[data.length];

        // Create student objects
        for (int i = 0; i < data.length; i++) {
            int[] scores = new int[4];

            for (int j = 0; j < 4; j++) {
                scores[j] = Integer.parseInt(data[i][j + 1]);
            }

            FStudents[i] = new FlowerStudents(data[i][0], scores);
        }

        // Sort by average using selection sort
        for (int i = 0; i < FStudents.length - 1; i++) {
            int highest = i;

            for (int j = i + 1; j < FStudents.length; j++) {
                if (FStudents[j].getAverage()
                        > FStudents[highest].getAverage()) {
                    highest = j;
                }
            }

            FlowerStudents temp = FStudents[i];
            FStudents[i] = FStudents[highest];
            FStudents[highest] = temp;
        }

        // Display leaderboard.
        System.out.println("CLASS LEADERBOARD");
        System.out.printf("%-8s %-15s %s%n",
                "Rank", "Name", "Average");

        int rank = 1;

        for (int i = 0; i < FStudents.length; i++) {

            if (i > 0 && FStudents[i].getAverage()
                    != FStudents[i - 1].getAverage()) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-15s %.2f%n",
                    rank, FStudents[i].name, FStudents[i].getAverage());
        }

        // Search for a student by name.
        String searchName = "John Mark";
        int found = -1;

        for (int i = 0; i < FStudents.length; i++) {
            if (FStudents[i].name.equalsIgnoreCase(searchName)) {
                found = i;
                break;
            }
        }

        System.out.println("\nSTUDENT SEARCH");

        if (found != -1) {
            System.out.println("Name: " + FStudents[found].name);
            System.out.printf("Average: %.2f%n",
                    FStudents[found].getAverage());
            System.out.println("Rank: " + rankOf(FStudents, found));
        } else {
            System.out.println("Student not found.");
        }
    }

    static int rankOf(FlowerStudents[] Flowerstudent, int index) {
        int flowerRank = 1;

        for (int i = 0; i < Flowerstudent.length; i++) {
            if (Flowerstudent[i].getAverage()
                    > Flowerstudent[index].getAverage()) {
                flowerRank++;
            }
        }

        return flowerRank;
    }
}
