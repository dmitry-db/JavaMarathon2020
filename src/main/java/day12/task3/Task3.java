package day12.task3;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Collection.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("werd", 1960);
        MusicBand musicBand2 = new MusicBand("sdad", 1990);
        MusicBand musicBand3 = new MusicBand("sdf", 1956);
        MusicBand musicBand4 = new MusicBand("asfa", 2010);
        MusicBand musicBand5 = new MusicBand("qrdzc", 1890);
        MusicBand musicBand6 = new MusicBand("tyyg", 2015);
        MusicBand musicBand7 = new MusicBand("asdc", 2009);
        MusicBand musicBand8 = new MusicBand("vcbb", 1977);
        MusicBand musicBand9 = new MusicBand("fsdf", 1940);
        MusicBand musicBand10 = new MusicBand("svfghd", 2020);
        MusicBand musicBand11 = new MusicBand("jbfg", 2002);

        List<MusicBand> list = new ArrayList<>();
        list.add(musicBand1);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);
        list.add(musicBand10);
        list.add(musicBand11);

        for (int i = 0; i < list.size(); i++) {
            System.out.print("Имя группы :" + list.get(i).getName() + " год: " + list.get(i).getYear() + "   ");
        }
        Collections.shuffle(list);
        System.out.println();
        for (int i = 0; i < groupsAfter2000(list).size(); i++) {
            System.out.print("Имя группы :" + groupsAfter2000(list).get(i).getName() + " год: " + groupsAfter2000(list).get(i).getYear() + "   ");
        }


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> list = new ArrayList<>();
        for (MusicBand s : bands){
            if (s.getYear() > 2000){
                list.add(s);
            }
        }
        return list;
    }
}
