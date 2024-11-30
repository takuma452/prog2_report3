package jp.ac.uryukyu.ie.e245743;

public class Enemy extends LivingThing {
    public Enemy (String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        super.setterhitPoint(getterhitPoint() - damage);
            if( super.getterhitPoint() < 0 ) {
                super.setterDead(true);
                System.out.printf("モンスター%sは倒れた。\n", super.getName());
            }
      }
}