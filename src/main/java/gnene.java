import java.util.Random;

public class gnene {

    public static String generateRandomChars (String candidateChars, int length) {
        StringBuilder sb = new StringBuilder ();
        Random random = new Random ();
        for (int i = 0; i < length; i ++) {
            sb.append (candidateChars.charAt (random.nextInt (candidateChars
                    .length ())));
        }

        return sb.toString ();
    }


    public static void main(String[] args) {


        System.out.println (generateRandomChars (
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 5));

    }
}
