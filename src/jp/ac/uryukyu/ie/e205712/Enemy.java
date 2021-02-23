//package jp.ac.uryukyu.ie.e205712;

public class Enemy extends LivingThing {
    @ Override
    public void wounded(int damage) {
        if (getHitPoint() <= 0) {
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
