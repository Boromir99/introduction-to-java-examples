package learning;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();
        Set<String> names2 = new HashSet<>();

        names1.add("George");
        names1.add("Jim");
        names1.add("John");
        names1.add("Blake");
        names1.add("Kevin");
        names1.add("Michael");

        names2.add("George");
        names2.add("Katie");
        names2.add("Kevin");
        names2.add("Michelle");
        names2.add("Ryan");

        System.out.println("Set1: " + names1);
        System.out.println("Set2: " + names2);

        Set<String> unionNames = new HashSet<>(names1);
        unionNames.addAll(names2);
        System.out.println("Union: " + unionNames);

        Set<String> differenceNames = new HashSet<>(names1);
        differenceNames.retainAll(names2);
        unionNames.removeAll(differenceNames);
        System.out.println("Difference: " + unionNames);

        Set<String> intersectionNames = new HashSet<>(names1);
        intersectionNames.retainAll(names2);
        System.out.println("Intersection: " + intersectionNames);
    }
}



