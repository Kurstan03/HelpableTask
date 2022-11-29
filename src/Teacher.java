public class Teacher extends Employee{
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void firstAid() {
        super.firstAid();
    }

    @Override
    public void swimAble() {
        super.swimAble();
    }

    public void teaching(){
       System.out.println("Teacher teaching pupils");
   }
}
