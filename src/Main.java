public class Main {
    public static void main(String[] args) {
       Helpable helpable = new Teacher("Teacher");
       helpable.firstAid();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       SwimAble swimAble = new Teacher("Teacher");
       swimAble.swimAble();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       Employee employee = new Teacher("Teacher");
       employee.firstAid();
       employee.swimAble();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       Teacher teacher = new Teacher("Teacher");
       teacher.swimAble();
       teacher.firstAid();
       teacher.teaching();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

       Helpable helpable1 = new Driver("driver");
       helpable1.firstAid();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       SwimAble swimAble1 = new Driver("driver");
       swimAble1.swimAble();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       Employee employee1 = new Driver("driver");
       employee1.swimAble();
       employee1.firstAid();
       System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       Driver driver = new Driver("driver");
       driver.swimAble();
       driver.firstAid();
       driver.driving();


    }
}