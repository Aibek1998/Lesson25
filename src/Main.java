import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer> list = new ArrayList<>();
        LinkedList <Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            int r = random.nextInt(2);
            list.add(r);
        }
        for (int i = 0; i < 15; i++) {
            int r = random.nextInt(2);
            list1.add(r);
        }
        System.out.println(list);
        System.out.println(list1);
        Collections.sort(list);
        Collections.sort(list1);
        System.out.println();
        System.out.println(list);
        System.out.println(list1);
    }

    public static void OverLoading(ArrayList<Integer>list) {


    }

}