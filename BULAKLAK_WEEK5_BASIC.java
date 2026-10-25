package bulaklak_week5_basic;

public class BULAKLAK_WEEK5_BASIC {
    public static void main(String[] args) {
         String[] flowerfav = {
            "Music",
            "Guitar",
            "Mobile Legends",
            "Food",
            "Pingpong"
        };

        for (int jm = 0; jm < flowerfav.length; jm++) {
            System.out.println((jm + 1) + ". " + flowerfav[jm]);
        }

        System.out.println("Total favorites: " + flowerfav.length);
    }  
}
