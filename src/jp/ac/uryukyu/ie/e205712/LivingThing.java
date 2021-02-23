//package jp.ac.uryukyu.ie.e205712;

public abstract class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      モンスター名
     * @param maximumHP モンスターのHP
     * @param attack    モンスターの攻撃力
     */

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 敵の名前の中継 敵の名前を返す。
     * 
     * @return String name;
     */
    public String getName() {
        return name;
    }

    /**
     * 敵の生死状態の中継 敵の生死状態を返す。
     * 
     * @return boolean dead;
     */
    public boolean isDead() {
        return dead;
    }

    public int getAttack() {
        return attack;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void attack(LivingThing opponent) {
        if (isDead() == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}