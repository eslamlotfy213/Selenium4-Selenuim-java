import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandminNumber {



    public static int generateRandomNumber(int upperBound) { //0 >> upper-1  > 5
        return new Random().nextInt(upperBound) + 1;
    }

    public static Set<Integer> generateUniqueNumber(int numberNeeded, int totalNumbers) {
        Set<Integer> generatedNumbers = new HashSet<>();
        while (generatedNumbers.size() < numberNeeded) {
            int randomNumber = generateRandomNumber(totalNumbers);
            generatedNumbers.add(randomNumber);
        }
        return generatedNumbers;
    }



    public static void main(String[] args) {

        Random random = new Random();

        int min = 1;
        int max = 1000000000;

        int value = random.nextInt(max + min) + min;

        System.out.println(value);


    }

}
