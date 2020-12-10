package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    public Paladin(){
        health = 100;
        physDef = 50;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (health >= 75){
            health = 100;
        }
        else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health >= 90){
            hero.health = 100;
        }
        else {
            hero.health += 10;
        }
    }

    @Override
    public void physicalAttack(Hero hero){
        double s;
        if (hero.physDef == 0){
            s = hero.health - 15;
        }
        else {
            s = hero.health - 15 * (1 - (hero.physDef / 100.0));
        }
        if (s < 0){
            hero.health = 0;
        }
        else {
            hero.health = s;
        }
    }
}
