//package jp.ac.uryukyu.ie.e205712;

public class Hero extends LivingThing {
    @ Override
    public void wounded(int damage) {
        if (getHitPoint() <= 0) {
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
