package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystemTest {
    public static void startStudentSystem() {
        //需要定义一个集合，存储学生对象
        ArrayList<Student> list = new ArrayList<>();
        w1:
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            //兼容性
            String choose = sc.next();
            //利用switch对选择做判断
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> selectStudent(list);
                case "5" -> {
                    //标号：调出指定的循环
                    break w1;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }


    //添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //创建学生对象，存储学生数据
        Student s = new Student();
        while (true) {
            System.out.println("请输入学生的id：");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                //表示重复
                System.out.println("你输入的学生学号重复，请重新输入");
            } else {
                //表示添加
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址：");
        String address = sc.next();
        s.setAddress(address);

        //将对象放入集合当中
        list.add(s);

        //温馨提示
        //集合中可以存储任何形式的数据，都会添加成功
        System.out.println("信息添加成功");
    }

    //删除学生方法
    public static void deleteStudent(ArrayList<Student> list) {
        //根据键盘录入的id删除对应的学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学生ID：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            //id存在，则删除
            //删除对应的索引
            list.remove(index);
            System.out.println("id为" + id + "的信息删除成功");
        } else {
            //id不存在,提示不存在,并回到初始菜单
            System.out.println("您要删除的学生信息不存在");
        }
    }

    //修改学生方法
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学学号");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            //表示不存在
            System.out.println("id为：" + id + "的学生信息不存在");
            //不存在，直接返回主菜单
            return;
        }
        //表示存在，需要修改
        System.out.println("请输入您要修改的学生姓名：");
        String newName = sc.next();
        list.get(index).setName(newName);

        System.out.println("请输入您要修改的学生年龄：");
        int newAge = sc.nextInt();
        list.get(index).setAge(newAge);

        System.out.println("请输入您要修改的学生家庭住址：");
        String newAddress = sc.next();
        list.get(index).setAddress(newAddress);

        System.out.println("信息修改成功");
    }

    //查询学生方法
    public static void selectStudent(ArrayList<Student> list) {
        //如果集合中索引为0，表示没有数据
        if (list.size() == 0) {
            System.out.println("当前集合中没有学生信息，请录入后在查询");
        }
        System.out.println("ID\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    //定义方法，对学号唯一性做判断
    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    //定义方法，返回id对应的索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
