package trees;

public class Student implements Comparable{

    private String code, name;
    private int mark;

    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;

    }

    public Student(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Object o) {
        return this.code.compareTo(((Student) o).code);
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", mark=" + mark + '}';
    }

}
