package jp.ac.uryukyu.ie.e245743;

public class Enemy extends LivingThing {
    public Enemy (String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        super.setterhitPoint(getHitPoint() - damage);
            if( this.getHitPoint() < 0 ) {
                this.setDead(true);
                System.out.printf("モンスター%sは倒れた。\n", this.getName());
            }
      }
}