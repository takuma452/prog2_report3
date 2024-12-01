package jp.ac.uryukyu.ie.e245743;

public class LivingThing {
  private String name;
  private int hitPoint;
  private int attack;
  private boolean dead;

  public LivingThing(String name, int hitPoint, int attack){
    this.name = name;
    this.hitPoint = hitPoint;
    this.attack = attack;
    dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
  }

  public boolean isDead(){
    return this.dead;
  }

  public void setDead(boolean isDead){
    this.dead = isDead;
  }

  public String getName(){
    return this.name;
  }

  public int getHitPoint(){
    return this.hitPoint;
  }

  public void setterhitPoint(int hitPoint){
    this.hitPoint = hitPoint;
  }

  public int getAttack() {
    return attack;
  }

  public void attack(LivingThing opponent){
    if (this.dead == true){
      return;
    }

    int damage = (int)(Math.random() * attack);
    System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);
    opponent.wounded(damage);
  }

  public void wounded(int damage){
    this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", this.name);
        }
  }
}
