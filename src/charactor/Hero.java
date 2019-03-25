package charactor;
import exception.EnemyHeroIsDeadException;
import porperty.Weapon;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 17:38 2018/10/22
 *@Modified By:
 */
public class Hero {
    protected String name;    //英雄名称
    protected float hp;   //血量
    protected float armor; //护甲
    protected float magicRisistance;  //魔抗
    protected int moveSpeed;  //移动速度
    static String copyRight = "RIOT GAMES";
    static float maxHP;
    public static int itemCapacity = 8;   //装备个数上限

    public Hero() {
    }

    ;

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, float hp, float armor, int moveSpeed) {
        this(name);
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public float getMagicRisistance() {
        return magicRisistance;
    }

    public void setMagicRisistance(float magicRisistance) {
        this.magicRisistance = magicRisistance;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }


    void carry() {
        System.out.println("疯狂carry！");
    }

    public void addSpeed(int speed) {
        moveSpeed = moveSpeed + speed;

    }

    public void legendary() {
        System.out.println("疯狂carry，极限超神！");
    }

    public void adAttack(int damage, Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            heros[i].hp = heros[i].hp - damage;
        }
    }

    public float recovery(float blood) {
        hp = hp + blood;
        return hp;
    }

    public void equip(Weapon w) {

    }

    public void die() {
        hp = 0;
    }

    public void kill(Hero h1) {
//        System.out.println(h1.name+"已经被"+name+"击杀");
        h1.die();
    }

    //直接调用
    public static void Ace() {
        System.out.println("Ace!!!!");
    }

    //内部类
    class battleScore {
        int kill;
        int die;
        int assit;

        public void KDA() {
            System.out.println("KDA=" + (kill + assit) / die);
        }
    }

    public void attackHero(Hero h) throws EnemyHeroIsDeadException {
        if (h.hp == 0) {
            throw new EnemyHeroIsDeadException(h.name + "已经阵亡，无法攻击");
        }
    }
//
//    public Hero() {
//
//    }
//    public Hero(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
        Hero garen = new Hero("盖伦");
//
//        garen.name="盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        System.out.println("garen.getMoveSpeed");
        System.out.println(garen.getMoveSpeed());

        Hero timo = new Hero("提莫");
//        timo.name="提莫";
        timo.hp = 383f;
        timo.armor = 14f;
        timo.moveSpeed = 330;

        garen.adAttack(100, timo);
        System.out.println(timo.hp);

        garen.copyRight = "Tencent Games";
        System.out.println(garen.copyRight);
        System.out.println(timo.copyRight);
        Hero.Ace();

        //KDAdisplay
        Hero kdah = new Hero();
        battleScore score = kdah.new battleScore();
        score.die = 1;
        score.assit = 5;
        score.kill = 14;
        score.KDA();

//
//        //自定义异常测试
//        timo.hp = 0;
//        try {
//            garen.attackHero(timo);
//        } catch (EnemyHeroIsDeadException e) {
//            System.out.println("异常的具体原因:\t" + e.getMessage());
//            e.printStackTrace();
//        }
    }
}