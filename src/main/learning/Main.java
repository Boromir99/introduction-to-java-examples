package learning;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] list = {2, 3, 5, 3, 7, 9, 5, 3, 7};
        int[] list2 = new int[list.length];
        int index = 0;

        Map<Integer, Integer> valueMap = new TreeMap<>();
        for (int n : list) {
            valueMap.put(n, valueMap.getOrDefault(n, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(valueMap.entrySet());

        Comparator<Map.Entry<Integer, Integer>> valueComparator =
                Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder());

        entryList.sort(valueComparator);

        Map<Integer, Integer> ordonare = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            ordonare.put(entry.getKey(), entry.getValue());
        }

        System.out.println(ordonare);

        for (Map.Entry<Integer, Integer> entry : ordonare.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            for (int i = 0; i < value; i++) {
                list2[index] = key;
                index++;
            }
        }
        System.out.println(Arrays.toString(list2));
    }
}



