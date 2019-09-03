package org.lhx.java;

import java.io.Serializable;

/**
 * @author lhx
 * @date 2019/9/3 - 15:03
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath() {
        System.out.println("生物呼吸");
    }

    public void eat() {
        System.out.println("生物吃东西");
    }

}
