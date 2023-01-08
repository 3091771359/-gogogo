package test1;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("电击小子", 100, '男');
        r1.showInfo();
        System.out.println("============================");
        r2.showInfo();
        //调用攻击方法，进行攻击，攻击是回合制的
        while (true) {
            //乔峰攻击电击小子
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }
            //乔峰攻击完，轮到电击小子了
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
