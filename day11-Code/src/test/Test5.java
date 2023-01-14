package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<Student> list = new ArrayList<>();
        //2、创建对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            //2.1给对象赋值
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);

            //2.2将对象放到集合中
            list.add(s);
        }

        //3、遍历集合
        //增强for
        //冒号前定义了一个变量，冒号后写上需要遍历的数组，循环取出数组里的每个数赋值给i，再使用print方法循环输出i
        for (Student stu : list) {
            //把每一个对象取出来，依次访问对象的属性
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
