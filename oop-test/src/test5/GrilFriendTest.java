package test5;

public class GrilFriendTest {
    public static void main(String[] args) {
        //1.创建数组
        GrilFriend[] arr = new GrilFriend[4];
        //2.创建对象
        GrilFriend gf1 = new GrilFriend("小诗诗", 17, '女', "听音乐");
        GrilFriend gf2 = new GrilFriend("小丹丹", 19, '女', "看漫画");
        GrilFriend gf3 = new GrilFriend("小莉莉", 20, '女', "打游戏");
        GrilFriend gf4 = new GrilFriend("小倩倩", 18, '女', "睡觉觉");
        //3.将对象存入数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        //4.计算年龄总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GrilFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        //5.计算平均年龄
        int avg = sum / arr.length;
        //6.统计小于平均年龄的女朋友有几个，并打印所有信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GrilFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
            }
        }
        System.out.println("有" + count + "个");
    }
}
