package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist a1 = new MusicArtist("Join L", 45);
        MusicArtist a2 = new MusicArtist("Mark Q", 30);
        MusicArtist b1 = new MusicArtist("Amer L", 45);
        MusicArtist b2 = new MusicArtist("Serhio Q", 30);

        List<MusicArtist> list1 = new ArrayList<MusicArtist>();
        list1.add(a1);
        list1.add(a2);

        List<MusicArtist> list2 = new ArrayList<MusicArtist>();
        list2.add(b1);
        list2.add(b2);

        day12.task5.MusicBand a = new day12.task5.MusicBand("Beatls", 1970, list1);
        day12.task5.MusicBand b = new day12.task5.MusicBand("Beatls", 1970, list2);

        a.printMembers();
        System.out.println();
        b.printMembers();
        System.out.println();

        transferMembers(a, b);

        b.printMembers();
        System.out.println("Конец b");
        a.printMembers();
        System.out.println();

    }

    public static void transferMembers(day12.task5.MusicBand a, day12.task5.MusicBand b) {
        List<MusicArtist> list = new ArrayList<>(b.getUch());
        for (MusicArtist s : a.getUch()){
            list.add(s);
        }
        b.setUch(list);
        List<MusicArtist> q = new ArrayList<>();
        a.setUch(q);
    }
}
