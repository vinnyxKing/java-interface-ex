public class cat extends animal implements DomesticAnimal, Carnivour{


    public cat(int age, String breed) {
        super(age, breed);
    }

    @Override
    public void sleep() {
        System.out.println( breed + " sleeps");
    }

    @Override
    public void run() {
        System.out.println(breed + " can run");
    }

    @Override
    public boolean isIsWarmBlooded() {
        return true;
    }

    @Override
    public void EatsMeat() {
     System.out.println(breed + " eats only meat");
    }
}
