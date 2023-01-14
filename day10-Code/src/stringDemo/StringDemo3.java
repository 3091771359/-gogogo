package stringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.定义正确的用户名和密码
        String rightusername = "zhangsan";
        String rightpassword = "123456";

        //2.键盘输入用户的用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("==========================");
            //3.对用户输入的用户名和密码进行判断
            if (username.equals(rightusername) && password.equals(rightpassword)) {
                //用户输入正确
                System.out.println("登录成功");
                break;
            } else {
                //输入的用户名或密码有误
                //第一次2-0，第二次2-1，第三次2-2
                //对次数进行判断，次数为0直接锁定账号
                if (i == 2) {
                    System.out.println("登录次数已达上限，账号已锁定，请联系管理员解锁");
                } else {
                    System.out.println("您输入的用户名或密码有误，请重新输入，当前剩余" + (2 - i) + "次");
                }
            }
        }
    }
}
