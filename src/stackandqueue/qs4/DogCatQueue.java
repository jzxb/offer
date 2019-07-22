package stackandqueue.qs4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lhx
 * @date 2019/7/22 - 20:01
 *
 * 由宠物，猫，狗类实现猫狗队列的结构，要求如下：
 *
 * 用户可以调用add方法将cat类或dog类d的实例放入队列中
 * 用户可以调用pollAll方法，将队列中的所有实例按照进队列的顺序依次弹出
 * 用户可以调用pollDag方法，将队列中的所有dog类的实例按顺序依次弹出
 * 用户可以调用pollCat方法，将队列中的所有cat类的实例按顺序依次弹出
 * 用户可以调用isEmpty方法，检查队列中是否还有dog或cat的实例
 * 用户可以调用isDogEmpty方法，检查队列中是否有dog类实例
 * 用户可以调用isCatEmpty方法，检查队列中是否有cat类实例
 */
public class DogCatQueue {

    private Queue<PetEnterQueue> catQ;
    private Queue<PetEnterQueue> dogQ;
    private long count;

    public DogCatQueue() {
        catQ = new LinkedList<>();
        dogQ = new LinkedList<PetEnterQueue>();
        count = 0;
    }

    public void add(Pet pet) {
        if (pet.getType().equals("dog")) {
            dogQ.add(new PetEnterQueue(pet, count++));
        } else if (pet.getType().equals("cat")) {
            catQ.add(new PetEnterQueue(pet, count++));
        } else {
            throw new RuntimeException("没有这种动物");
        }
    }

    public Pet pollAll() {
        if (!dogQ.isEmpty() && !catQ.isEmpty()) {
            if (dogQ.peek().getCount() < catQ.peek().getCount()) {
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!dogQ.isEmpty()) {
            return dogQ.poll().getPet();
        } else if (!catQ.isEmpty()) {
            return catQ.poll().getPet();
        } else {
            throw new RuntimeException("队列空");
        }
    }

    public Dog pollDog() {
        if (dogQ.isEmpty()) {
            throw new RuntimeException("队列中无狗");
        } else {
            return (Dog) dogQ.poll().getPet();
        }
    }

    public Cat pollCat() {
        if (catQ.isEmpty()) {
            throw new RuntimeException("队列中无猫");
        } else {
            return (Cat) catQ.poll().getPet();
        }
    }

    public boolean isEmpty() {
        return dogQ.isEmpty() && catQ.isEmpty();
    }

    public boolean isDogEmpty() {
        return dogQ.isEmpty();
    }

    public boolean isCatEmpty() {
        return catQ.isEmpty();
    }

}
