package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> uch;

    public MusicBand(String name, int year, List<MusicArtist> uch){
        this.name = name;
        this.year= year;
        this.uch = uch;
    }

    public void setUch(List<MusicArtist> uch) {
        this.uch = uch;
    }

    public List<MusicArtist> getUch() {
        return uch;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void printMembers(){
        for (MusicArtist s : uch){
            System.out.println("Участник :" + s.getName() + " ");
        }
    }

}
