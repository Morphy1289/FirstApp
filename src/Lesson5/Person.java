package Lesson5;

public class Person {
    private String name;
    private String position;
    private String eMail;
    private String phoneNum;
    private int salary;
    private int age;


    public Person(String name, String position, String eMail, String phoneNum, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void info(){
        System.out.println(name + " " + position + " " + eMail + " " + phoneNum + " " + salary + " " + age);
    }
}
