package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior(){
        health = 100;
        physDef = 80;
        magicDef = 0;
    }

    @Override
    public void physicalAttack(Hero hero){
        double s;
        if (hero.physDef == 0){
            s = hero.health - 30;
        }
        else {
            s = hero.health - 30 * (1 - (hero.physDef / 100.0));
        }
        if (s < 0){
            hero.health = 0;
        }
        else {
            hero.health = s;
        }
    }
}
