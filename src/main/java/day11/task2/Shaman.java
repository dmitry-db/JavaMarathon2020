package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {
    public Shaman(){
        health = 100;
        physDef = 20;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (health >= 50){
            health = 100;
        }
        else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health >= 70){
            hero.health = 100;
        }
        else {
            hero.health += 30;
        }
    }

    @Override
    public void physicalAttack(Hero hero){
        double s;
        if (hero.physDef == 0){
            s = hero.health - 10;
        }
        else {
            s = hero.health - 10 * (1 - (hero.physDef / 100.0));
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
            s = hero.health - 15;
        }
        else {
            s = hero.health - 15 * (1 - (hero.magicDef / 100.0));
        }
        if (s < 0){
            hero.health = 0;
        }
        else {
            hero.health = s;
        }
    }
}
