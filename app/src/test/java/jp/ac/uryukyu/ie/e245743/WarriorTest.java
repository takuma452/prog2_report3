package jp.ac.uryukyu.ie.e245743;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class WarriorTest {
  @Test
  void attackWithWeponSkillTest() {
    Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
    Enemy demoSlime = new Enemy("スライムもどき", 450, 100);
    int beforeAttackHitPoint;
    int afterAttackHitPoint;
    int expectedHitPoint = 150;

    for (int i = 0; i < 3; i++) {
      beforeAttackHitPoint = demoSlime.getHitPoint();
      demoWarrior.attackWithWeponSkill(demoSlime);
      afterAttackHitPoint = demoSlime.getHitPoint();
      assertEquals(expectedHitPoint, beforeAttackHitPoint - afterAttackHitPoint);
    }
  }
}
