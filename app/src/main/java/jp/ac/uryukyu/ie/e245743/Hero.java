package jp.ac.uryukyu.ie.e245743;

public class Hero extends LivingThing{
    public Hero (String name, int hitPoint, int attack) {
       super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage){
        super.setterhitPoint(getterhitPoint() - damage);
            if( super.getterhitPoint() < 0 ) {
                super.setterDead(true);
                System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", super.getName());
            }
    }
}