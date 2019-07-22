package stackandqueue.qs4;

/**
 * @author lhx
 * @date 2019/7/22 - 20:14
 */
public class PetEnterQueue {

    private Pet pet;
    private Long count;

    public PetEnterQueue(Pet pet, Long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public Long getCount() {
        return count;
    }

    public String getEnterPetType() {
        return pet.getType();
    }

}
