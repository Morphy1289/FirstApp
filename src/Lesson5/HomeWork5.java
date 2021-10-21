package Lesson5;

public class HomeWork5 {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 21);
        persArray[1] = new Person("Иванова Света", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 48);
        persArray[2] = new Person("Петров Егор", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 35);
        persArray[3] = new Person("Сидоров Александр", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 29);
        persArray[4] = new Person("Бернгард Елена", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 61);

        for (Person person : persArray) {
            person.info();
        }
        System.out.println();//для пропуска строки
        for (Person person : persArray) {
            if (person.getAge() > 40) {
                person.info();
            }
        }
    }
}

