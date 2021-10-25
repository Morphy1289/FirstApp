package Lesson6;

public class TestAnimal
{
    public static void main(String[] args){

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        int randR = (int) (Math.random() * 1500);
        int randJ = (int) (Math.random() * 8);
        int randS = (int) (Math.random() * 250);

        dog1.runAndGun(randR,"Bobik1");
        dog1.swimAndGim(randS, "Bobik1");
        dog1.jumpAndPump(randJ, "Bobik1");

        dog2.runAndGun(randR,"Bobik2");
        dog2.swimAndGim(randS, "Bobik2");
        dog2.jumpAndPump(randJ, "Bobik2");

        dog3.runAndGun(randR,"Bobik3");
        dog3.swimAndGim(randS, "Bobik3");
        dog3.jumpAndPump(randJ, "Bobik3");

        cat1.runAndGun(randR, "Barsik1");
        cat1.swimAndGim(randS, "Barsik1");
        cat1.jumpAndPump(randJ, "Barsik1");
        cat2.runAndGun(randR, "Barsik2");
        cat2.swimAndGim(randS, "Barsik2");
        cat2.jumpAndPump(randJ, "Barsik2");
    }
}
