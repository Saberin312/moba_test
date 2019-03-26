package charactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 20:19 2019/3/26
 *@Modified By:
 */
public class HeroNode {
    public Hero hero;
    public HeroNode leftHeroNode;
    public HeroNode rightHeroNode;

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public HeroNode getLeftHeroNode() {
        return leftHeroNode;
    }

    public void setLeftHeroNode(HeroNode leftHeroNode) {
        this.leftHeroNode = leftHeroNode;
    }

    public HeroNode getRightHeroNode() {
        return rightHeroNode;
    }

    public void setRightHeroNode(HeroNode rightHeroNode) {
        this.rightHeroNode = rightHeroNode;
    }

    public void add(Hero hero1) {
        if (hero == null) {
            hero = hero1;
        } else {
            if (hero.getHp() >= hero1.getHp()) {
                if (leftHeroNode == null) {
                    leftHeroNode = new HeroNode();
                }
                leftHeroNode.add(hero1);
            } else {
                if (rightHeroNode == null) {
                    rightHeroNode = new HeroNode();
                }
                rightHeroNode.add(hero1);
            }
        }
    }

    public List<Object> heros() {
        List<Object> heros = new ArrayList<>();
        if (leftHeroNode != null) {
            heros.addAll(leftHeroNode.heros());
        }
        heros.add(hero);
        if (rightHeroNode != null) {
            heros.addAll(rightHeroNode.heros());
        }
        return heros;
    }

    public static void main(String[] args) {
        HeroNode heroNode = new HeroNode();
        Hero[] heroes = new Hero[10];
        for (int i = 0; i < 10; i++) {
            heroes[i] = new Hero();
            heroes[i].setName("hero" + i);
            System.out.println(heroes[i].getName());
            heroes[i].setHp((int) (1 + Math.random() * 1000));
            System.out.println(heroes[i].getHp());

            heroNode.add(heroes[i]);
        }
        System.out.println(heroNode.heros());

    }
}
