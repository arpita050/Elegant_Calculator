package branch;

public class b1 {
    String name, id;
    float cgpa;
    int mark;

    public b1(String name, String id, float cgpa, int mark) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
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
