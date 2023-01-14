package work1;

public class test {
    public static void main(String[] args) {
        //测试类
        Manager m = new Manager("张三", "123", 15000, 6000);
        Coder c = new Coder("李四", "135", 10000);
        m.work();
        c.work();
    }
}
