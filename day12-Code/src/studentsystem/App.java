package studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        //键盘录入主页面
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生信息管理系统登录页面");
            System.out.println("请输入您的选择：1.登录 2.注册 3.忘记密码 4.退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> enroll(list);
                case "3" -> forgotpassword(list);
                case "4" -> {
                    System.out.println("感谢您的使用，下次再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //忘记密码方法
    private static void forgotpassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("用户" + username + "未注册，请先注册");
            return;
        }
        System.out.println("请输入身份证号码");
        String personID = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();
        //定义方法把每个用户对象在集合中的索引取出来
        //在通过索引获取每个对象的属性进行判断
        int index = findIndex(list, username);
        User user = list.get(index);
        if (!(user.getPersonid().equalsIgnoreCase(personID) && user.getPhonenumber().equals(phoneNumber))) {
            System.out.println("账号信息不匹配，修改失败");
            //直接结束方法
            return;
        }
        String password;
        while (true) {
            System.out.println("请输入新密码");
            password = sc.next();
            System.out.println("请再次输入新密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }
        user.setPassword(password);
        System.out.println("密码修改成功");
    }

    //获取用户名对应索引的方法
    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    //登录方法
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            //需要判断用户名是否注册
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("当前用户" + username + "没有注册，请注册后使用");
                //没有注册，直接结束方法
                return;
            }
            System.out.println("请输入密码");
            String password = sc.next();
            //在获取验证码
            while (true) {
                //需要把验证码拿出来，为下面使用做基础
                String rightcode = getCode();
                System.out.println("当前验证码为" + rightcode);
                System.out.println("请输入验证码");
                String Captcha = sc.next();
                //对验证码进行判断，不区分大小写
                if (Captcha.equalsIgnoreCase(rightcode)) {
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                }
            }
            //在对用户名和密码进行判断
            //定义方法对用户名和密码进行校验
            //封装思想，以后遇到一些零散的数据，只需要将这些数据封装为一个整体对象，不需要传入这些零散的数据
            User userInfo = new User(username, password, null, null);
            boolean result = checkuserInfo(list, userInfo);
            if (result) {
                System.out.println("登录成功");
                //调用学生管理系统方法,启动学生管理系统
                StudentSystemTest.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败，用户名或者密码错误");
                //对剩余次数进行判断
                if (i == 2) {
                    System.out.println("当前账号" + username + "被锁定，请联系管理员处理");
                } else {
                    System.out.println("剩余" + (2 - i) + "次机会");
                }
            }
        }
    }

    //用户名和密码校验方法
    private static boolean checkuserInfo(ArrayList<User> list, User userInfo) {
        //遍历集合判断用户是否存在，存在，登录成功，不存在，登录失败
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(userInfo.getUsername())
                    && list.get(i).getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        //找完找不到
        return false;
    }

    //注册方法
    private static void enroll(ArrayList<User> list) {
        //键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入您要注册的用户名");
            username = sc.next();
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                //表示，不合法
                System.out.println("您输入的用户名不合法,请重新输入");
                //不合法，返回上面继续输入
                continue;
            }
            //用户名唯一
            boolean flag2 = contains(list, username);
            if (flag2) {
                //表示重复
                System.out.println("当前用户名" + username + "已经注册");
            } else {
                System.out.println("当前用户名" + username + "注册成功");
                //注册成功直接结束循环
                break;
            }
        }
        //密码键盘输入两次，两次一致才可以进行注册。
        String password1;
        String password2;
        while (true) {
            System.out.println("请输入您的密码");
            password1 = sc.next();
            System.out.println("请再次输入您的密码");
            password2 = sc.next();
            boolean flag = checkPassWord(password1, password2);
            if (flag) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }
        //键盘录入身份证号码
        String personID;
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            boolean flag = checkpersonID(personID);
            if (flag) {
                System.out.println("身份证号码格式正确");
                break;
            } else {
                System.out.println("身份证号码格式不正确，请重新输入");
            }
        }
        //键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入您的手机号码");
            phoneNumber = sc.next();
            boolean flag = checkphoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号码格式正确");
                break;
            } else {
                System.out.println("手机号码格式不正确，请重新输入");
            }
        }
        //创建对象，传入正确的参数
        User u = new User(username, password1, personID, phoneNumber);
        //将对象存入集合
        list.add(u);
        System.out.println("注册成功");
        //遍历打印
        printList(list);
    }

    //遍历集合信息方法
    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", "
                    + user.getPersonid() + ", " + user.getPhonenumber());
        }
    }

    //定义手机号码验证方法
    private static boolean checkphoneNumber(String phoneNumber) {
        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0为开头
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    //定义身份证号码验证方法
    private static boolean checkpersonID(String personID) {
        //长度为18位
        if (personID.length() != 18) {
            return false;
        }
        //不能以0为开头
        if (personID.startsWith("0")) {
            //如果以0开头，直接返回false
            return false;
        }
        //前17位，必须都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //最为一位可以是数字，也可以是大写X或小写x
        char c = personID.charAt(personID.length() - 1);
        if ((c >= '0' && c <= '9') || (c == 'x') || (c == 'X')) {
            return true;
        } else {
            return false;
        }
    }

    //定义方法对两次输入密码进行校验
    private static boolean checkPassWord(String password1, String password2) {
        if (!(password1.equals(password2))) {
            return false;
        }
        return true;
    }

    //定义方法对用户名唯一性进行判断
    private static boolean contains(ArrayList<User> list, String username) {
        //循环遍历集合中的对象 的 用户名
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    //用户名格式校验方法
    private static boolean checkUsername(String username) {
        //用户名校验--先校验格式，在校验唯一
        //直接调用变量，简化代码
        //用户名长度必须在3~15位之间
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }
        //代码执行到这里，说明长度是合法的
        //继续校验：只能是字母加数字的组合，但是不能是纯数字
        for (int i = 0; i < username.length(); i++) {
            //循环取出每一个字符
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                //如果有一个不在上面的范围内，就是false
                return false;
            }
        }
        //继续校验，不能是纯数字
        //当username中有一个字符是a-z||A-Z之间，就是合法的
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        //如果大于0 ，就表示合法，返回true
        return count > 0;
    }

    //获取验证码
    private static String getCode() {
        //1.创建一个集合存储大小写字母，都是字符（Character）
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        //2.抽取4个字符,在集合当中
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取到随机索引
            int index = r.nextInt(list.size());
            //在根据随机索引获取随机字符
            char c = list.get(index);
            //拼接在循环内完成，将随机字符拼接到sb当中
            sb.append(c);
        }
        //3.将一个随机数字添加到字符串当中
        int number = r.nextInt(10);
        sb.append(number);
        //4.将字符串转换为字符数组，在打乱顺序
        char[] arr = sb.toString().toCharArray();
        //获取字符数组的随机索引
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //返回一个新的字符串(将数组转换为字符串)
        return new String(arr);
    }
}
