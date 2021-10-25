package Lesson6;

public class Animal {

    int randMr = (int) (Math.random() * 1500); //генерируем случайное значение
    int maxRun = randMr;                       //максимальных возможностей каждого объекта
    int randMj = (int) (Math.random() * 8);
    int maxJump = randMj;
    int randMs = (int) (Math.random() * 250);
    int maxSwim = randMs;

    public void runAndGun(int runDist, String name){
        if(runDist < maxRun){
            System.out.println(name + " Пробежал " + runDist + " MaxRun = " + maxRun);
        }else {
            System.out.println(name + " Не пробежал " + runDist + " MaxRun = " + maxRun);
        }
    }

    public void swimAndGim(int swimDist, String name){
        if(maxSwim > swimDist){
            System.out.println ("Собака " + name + " проплыла дистанцию "+ swimDist + ", а могла проплыть " +
                    maxSwim);
        }else {
            System.out.println("Собака " + name + " утонула на отметке " + maxSwim +
                    ", а должна была проплыть " + swimDist);
            //countDead++;
            System.out.println();
        }
    }

    public void jumpAndPump(int jumpHeight, String name){
        if(maxJump >= jumpHeight){
            System.out.println ("Собака " + name + " перепрыгнула высоту в "+ jumpHeight +
                    ", а максимально могла " + maxJump);
        }else {
            System.out.println(name + " не перепрыгнул " +  jumpHeight +
                    " допрыгнув до отметки " + maxJump);
        }
    }
}