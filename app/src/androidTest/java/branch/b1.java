package branch;

public class b1 {
    String name, id;
    float cgpa;

    b1(String s, String s1, float f){
        this.name=s;
        this.id=s1;
        this.cgpa=f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
