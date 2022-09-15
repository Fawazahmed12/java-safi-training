package BasicsLearning.super_usage;

public class Dog extends Animal {
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("hahahaaaaa");
    }
}
