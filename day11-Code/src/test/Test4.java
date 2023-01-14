package test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三", 18));
        list.add(new Student("李四", 18));

        for (Student stu : list) {
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
