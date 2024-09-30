import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;

public class mapV2 {
    
    public static void main(String[] args) throws Exception {
        Map<Object, List<Integer>> mapping = new HashMap<>();
        Random random = new Random();

        int count = random.nextInt(100);
        int[] randomArray = new int[count];
        Object[] randomObject = new Object[count];

        for (int i = 0; i < count; i++) {
            randomArray[i] = random.nextInt(100);
            randomObject[i] = generateRandomString(random, 5);
        }
        for (int i = 0; i < count; i++) {
            List <Integer> manipulasi = new ArrayList<>();
            manipulasi.add(randomArray[i]);
            mapping.put(randomObject[i], manipulasi);
        }

        String stats = "";
        for (Map.Entry<Object, List<Integer>> display : mapping.entrySet()) {
            stats += "Object : " + display.getValue();
            stats += " total : " + display.getKey() + "\n";
        }
        System.out.println(stats); 
    }

    private static String generateRandomString(Random random, int length) {
        StringBuilder sb = new StringBuilder();
        String karakter = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i <length; i++) {
            sb.append(karakter.charAt(random.nextInt(karakter.length())));
        }
        return sb.toString();
    }
}
