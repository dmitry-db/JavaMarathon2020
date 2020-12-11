package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand a = new MusicBand("Beatls", 1970);
        MusicBand b = new MusicBand("LP", 1997);
        List<String> list1 = new ArrayList<>();
        list1.add("Join L");
        list1.add("Mark Q");
        List<String> list2 = new ArrayList<>();
        list2.add("Amer L");
        list2.add("Serhio Q");
        a.setUch(list1);
        b.setUch(list2);

        a.printMembers();
        b.printMembers();

        transferMembers(a, b);
        System.out.println();

        b.printMembers();
        System.out.println();
        a.printMembers();

    }
    public static void transferMembers (MusicBand a, MusicBand b){
        List<String> list = new ArrayList<>(b.getUch());
        for (String s: a.getUch()){
            list.add(s);
        }
        b.setUch(list);
        List<String> q = new ArrayList<>();
        a.setUch(q);
    }
}
