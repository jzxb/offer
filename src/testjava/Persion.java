package testjava;

/**
 * @author lhx
 * @date 2019/9/2 - 14:59
 */
public class Persion {

    private String name;
    public int age;

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Persion() {
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Persion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("你好");
    }

    private String showNation(String nation) {
        System.out.println("国籍：" + nation);
        return nation;
    }

}
