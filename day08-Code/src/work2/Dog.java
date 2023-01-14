package work2;

public class Dog {
    //狗类
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * 设置
     *
     * @param breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println(this.color + "的" + this.breed + "正在啃骨头.....");
    }

    public void lookHome() {
        System.out.println(this.color + "的" + this.breed + "正在看家.....");
    }
}
