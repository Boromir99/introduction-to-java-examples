package learning;


public class Main {
    public static void main(String[] args) {

        GenericStack<String> names = new GenericStack<>();

        names.push("John");
        names.push("Otis");
        names.push("Otis");
        names.push("Maria");
        names.push("Maria");
        names.push("Maria");
        names.push("Denis");

        System.out.println(names.string());
        System.out.println(names.empty());
        System.out.println(names.peek());
        System.out.println(names.pop());

        GenericStack.removeDuplicates(names);
        System.out.println("Without duplicates " + names.string());

        GenericStack.shuffle(names);
        System.out.println("Shuffle " + names.string());

        GenericStack.sort(names);
        System.out.println("Sort " + names.string());

    }
}
