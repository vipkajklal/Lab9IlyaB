public class Main {
    public static void main(String[] args) {
        Shkolnik sh1 = new Shkolnik("Daniil");
        Shkolnik sh2 = new Shkolnik("Sasha");

        Student st1  = new Student("Ilya");
        Student st2  = new Student("Lida");

        Conference conference = new Conference();
        conference.mashuman.add(sh1);
        conference.mashuman.add(sh2);
        conference.mashuman.add(st1);
        conference.mashuman.add(st2);

        conference.printStud();
        System.out.println();
        conference.printShk();
        System.out.println();
        conference.KolStud();
        conference.KolShk();
    }
}
