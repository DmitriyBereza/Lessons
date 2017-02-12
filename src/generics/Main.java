package generics;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
           //reload
        list1.removeAll(list2);
        list2 = new ArrayList<>();




    }




}
