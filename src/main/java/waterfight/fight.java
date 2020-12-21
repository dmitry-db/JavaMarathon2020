package waterfight;

import java.util.Scanner;

public class fight {
    public static void main(String[] args) {
        PlayingField field1 = new PlayingField();
        field1.addOneShip(1,4);
        field1.addOneShip(5,9);
        field1.addOneShip(5,5);
        field1.addOneShip(4,3);
        field1.addDbShip(2,1,2,2);
        field1.addDbShip(0,9,1,9);
        field1.addDbShip(8,0,9,0);
        field1.addTrShip(9,6,9,7,9,8);
        field1.addTrShip(7,2,7,3,7,4);
        field1.addFrShip(3,7,4,7,5,7,6,7);

        Attack player2 = new Attack("player2", field1);

        player2.att(1,4);
        player2.att(5,9);
        player2.att(5,5);
        player2.att(4,3);
        player2.att(2,1);
        player2.att(2,2);
        player2.att(0,9);
        player2.att(1,9);
        player2.att(8,0);
        player2.att(9,0);
        player2.att(9,6);
        player2.att(9,7);
        player2.att(9,8);
        player2.att(7,2);
        player2.att(7,3);
        player2.att(7,4);
        player2.att(3,7);
        player2.att(4,7);
        player2.att(1,1);
        player2.att(5,7);
        player2.att(6,7);








        field1.Printmas();

    }
}
