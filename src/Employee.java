public abstract class Employee implements Helpable,SwimAble{

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void firstAid() {
        System.out.println(getName() + " giving first aid");
    }

    @Override
    public void swimAble() {
        System.out.println(getName() + " swims in the pool");
    }
}
