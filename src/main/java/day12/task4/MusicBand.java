package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> uch;

    public MusicBand(String name, int year){
        this.name = name;
        this.year= year;
    }

    public void setUch(List<String> uch) {
        this.uch = uch;
    }

    public List<String> getUch() {
        return uch;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void printMembers(){
        for (String s : uch){
            System.out.println("Участник :" + s + " ");
        }
    }

}
