package charactor;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 8:57 2018/10/24
 *@Modified By:
 */
public class KillDisplay extends Hero {

    public static void main(String[] args) {
        ADC Ashe=new ADC();
        Ashe.setName("艾希");
        APC Annie=new APC();
        Annie.setName("安妮");
    KillDisplay Gallen=new KillDisplay();
    Gallen.kill(Ashe);
    Gallen.kill(Annie);

    }
}
