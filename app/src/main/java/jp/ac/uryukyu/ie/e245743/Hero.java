package jp.ac.uryukyu.ie.e245743;

public class Hero extends LivingThing{
    public Hero (String name, int hitPoint, int attack) {
       super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        this.setterhitPoint(getHitPoint() - damage);
            if( this.getHitPoint() < 0 ) {
                this.setDead(true);
                System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
            }
    }
}