public class Driver extends Employee{
    public Driver(String name) {
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

    public void driving(){

        System.out.println("Driver driving a car");
    }
}
