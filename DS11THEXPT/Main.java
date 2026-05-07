

import java.util.*;

public class Main {

    public static void main(String[] args) {

        
        int[] marks = {85, 90, 78, 88};

        System.out.println("Array Elements:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        // STACK
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\n\nStack Elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("\n\nQueue Elements:");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }


        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("\n\nLinked List Elements:");
        for (String lang : list) {
            System.out.print(lang + " ");
        }

        // TREE MAP
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1, "A");
        tree.put(2, "B");
        tree.put(3, "C");

        System.out.println("\n\nTreeMap Elements:");
        for (Map.Entry<Integer, String> entry : tree.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}