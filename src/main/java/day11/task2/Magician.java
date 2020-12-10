package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {


    public Magician(){
        health = 100;
        physDef = 0;
        magicDef = 80;
    }

    @Override
    public void physicalAttack(Hero hero){
        double s;
        if (hero.physDef == 0){
            s = hero.health - 5;
        }
        else {
           s = hero.health - 5 * (1 - (hero.physDef / 100.0));
        }
        if (s < 0){
            hero.health = 0;
        }
        else {
            hero.health = s;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double s;
        if (hero.magicDef == 0){
            s = hero.health - 20;
        }
        else {
            s = hero.health - 20 * (1 - (hero.magicDef / 100.0));
        }
        if (s < 0){
            hero.health = 0;
        }
        else {
            hero.health = s;
        }
    }
}
