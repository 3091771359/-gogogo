package work1;

public class Manager {
    //经理类
    //属性
    private String name;
    private String id;
    private double salary;
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 获取
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     *
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //定义行为，方法
    public void work() {
        System.out.println("工号为" + this.id + "基本工资为" + this.salary + "奖金为" + this.bonus + "的项目经理" + this.name + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
