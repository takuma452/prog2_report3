package jp.ac.uryukyu.ie.e245743;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 名前を参照するメソッド。
     */
    public String getterName(){
        return this.name;
    }

   
    /**
     * HPを参照するメソッド。
     */
    public int getterHitpoint(){
        return this.hitPoint;
    }


    /**
     * 攻撃力を参照するメソッド。
     */
    public int getterAttack(){
        return this.attack;
    }


    /**
     * 生死状態を参照するメソッド。
     */
    public boolean getterDead(){
        return this.dead;
    }

    /**
     * 名前を変更するメソッド。
     */
    public void setterName(String name){
        this.name = name;
    }

    /**
     * HPを変更するメソッド。
     */
    public void setterHitpoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

     /**
     * 攻撃力を変更するメソッド。
     */
    public void setterName(int attack){
        this.attack = attack;
    }

   /**
     * 生死状態の判定を変更するメソッド。
     */
    public void setterDead(boolean dead){
        this.dead = dead;
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if (dead == true){
            return;
        }
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getterName(), damage);
        hero.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}