package learning;

import java.util.ArrayList;
import java.util.Random;

public class GenericStack<T> extends ArrayList<T> {


    public int getSize() {
        return size();
    }

    public T peek() {
        return get(getSize() - 1);
    }

    public void push(T o) {
        add(o);
    }

    public T pop() {
        T o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public boolean empty() {
        return isEmpty();
    }

    public String string() {
        return "stack: " + toString();
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    public static <T> int random(ArrayList<T> list) {
        Random random = new Random();
        return random.nextInt(list.size());
    }

    public static <T> void shuffle(ArrayList<T> list) {
        ArrayList<T> tempList = new ArrayList<>(list);

        while (list.equals(tempList)) {
            for (int i = 0; i < list.size(); i++) {
                int tempIndex = random(list);
                int tempIndex2 = random(list);

                if (tempIndex != tempIndex2) {
                    T tempObject = list.get(tempIndex);
                    T tempObject2 = list.get(tempIndex2);

                    list.add(tempIndex, tempObject2);
                    list.remove(tempIndex + 1);
                    list.add(tempIndex2, tempObject);
                    list.remove(tempIndex2 + 1);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        list.sort(null);
    }
}
