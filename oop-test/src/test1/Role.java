package test1;

import java.util.Random;
    /*
    文字游戏（回合制）
    2023~01~07
    */

public class Role {
    //属性
    private String name;
    private int blood;
    private String face;
    private char sex;
    //定义数组，存储长相
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};


    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role(String name, int blood, char sex) {
        this.name = name;
        this.blood = blood;
        this.sex = sex;
        //不添加长相，因为长相是通过随机的
        //通过调用方法进行判断赋值
        setFace(sex);
    }

    public Role() {
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char sex) {
        //对性别进行判断，随机长相
        Random r = new Random();
        if (sex == '男') {
            int Index = r.nextInt(boyfaces.length);
            this.face = boyfaces[Index];
        } else if (sex == '女') {
            int Index = r.nextInt(girlfaces.length);
            this.face = girlfaces[Index];
        } else {
            System.out.println("面目狰狞");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义攻击方法
    //分析：谁调用攻击方法攻击了谁
    //括号中为被攻击的人，this表示攻击的人
    public void attack(Role role) {
        //随机武功招式
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[index];
        //输出攻击效果
        System.out.printf(KungFu, this.name, role.name);
        System.out.println();
        //计算血量，每一次造成的伤害都是一个随机数
        //每次造成1~30点伤害不等
        int hurt = r.nextInt(30) + 1;
        //造成伤害后，需要修改一下挨揍人的血量
        //定义变量用来接受受害者的剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量进行判断，不能小于0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //再把剩余血量传上去
        role.setBlood(remainBlood);
        //受伤的描述
        //对受伤人剩余血量进行判断
        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        } else if (remainBlood > 80 && remainBlood <= 90) {
            System.out.printf(injureds_desc[1], role.getName());
        } else if (remainBlood > 70 && remainBlood <= 80) {
            System.out.printf(injureds_desc[2], role.getName());
        } else if (remainBlood > 60 && remainBlood <= 70) {
            System.out.printf(injureds_desc[3], role.getName());
        } else if (remainBlood > 40 && remainBlood <= 60) {
            System.out.printf(injureds_desc[4], role.getName());
        } else if (remainBlood > 20 && remainBlood <= 40) {
            System.out.printf(injureds_desc[5], role.getName());
        } else if (remainBlood > 10 && remainBlood <= 20) {
            System.out.printf(injureds_desc[6], role.getName());
        } else {
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();
        System.out.println("=======================================");
    }

    //打印基本信息
    public void showInfo() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getBlood());
        System.out.println("性别为:" + getSex());
        System.out.println("长相为:" + getFace());
    }
}
