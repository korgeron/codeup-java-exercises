import java.util.HashMap;

public class test {
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);

        System.out.println(map);


        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

    }
}
