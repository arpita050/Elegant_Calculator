package master;

public class master {
    int roll;
    String name;

    master(String a, int r)
    {
        this.roll=r;
        this.name=a;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
