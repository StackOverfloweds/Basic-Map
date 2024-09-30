import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListColection {
    public static void main(String[] args) {
        // Membuat sebuah List dari Map
        List<Map<String, Integer>> listOfMaps = new ArrayList<>();

        // Membuat sebuah Map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        // Menambahkan map1 ke dalam listOfMaps menggunakan metode add()
        listOfMaps.add(map1);

        // Membuat sebuah Map lainnya
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 3);
        map2.put("D", 4);

        // Menambahkan map2 ke dalam listOfMaps menggunakan metode add()
        listOfMaps.add(map2);

        // Mencetak isi dari listOfMaps
        System.out.println("Isi listOfMaps:");
        System.out.println(listOfMaps);
    }
}
