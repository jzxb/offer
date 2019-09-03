package org.lhx.java;

/**
 * @author lhx
 * @date 2019/9/3 - 15:05
 */
@MyAnnotation(value = "hi")
public class Persion extends Creature<String> implements Comparable<String>, MyInterface {

    private String name;
    int age;
    public int id;

    public Persion() {
    }

    @MyAnnotation(value = "abc")
    private Persion(String name) {
        this.name = name;
    }

    Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation) {
        System.out.println("国籍：" + nation);
        return nation;
    }

    public String display(String interests) {
        return interests;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("人");
    }
}
