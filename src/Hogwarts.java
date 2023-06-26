import java.util.Objects;

public class Hogwarts {
    private String student;
    private String faculty;
    private int magic;
    private int distance;

    public Hogwarts(String student,String faculty, int magic, int distance) {
        this.student = student;
        this.faculty = faculty;
        this.magic = magic;
        this.distance = distance;
    }

    public String getStudent() {
        return student;
    }

    public String getFaculty() {
        return faculty;
    }


    public int getMagic() {
        return magic;
    }

    public int getDistance() {
        return distance;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void compare(Hogwarts o) {
    if (this.getMagic() > o.getMagic()) {
        System.out.println(this.student + " с "+ this.faculty +" обладает бельшей силой магии чем " + o.student +" с "+ o.faculty);
    } else {
        System.out.println(o.student + " с "+ o.faculty +" обладает бельшей силой магии чем " + this.student+ " с "+ this.faculty);
    }
    if (this.getDistance() > o.distance) {
        System.out.println(this.student + " с "+ this.faculty + " обладает бельшей силой трансгрессирования чем "
                + o.student+ " с "+ o.faculty);
    } else {
        System.out.println(o.student + " с "+ o.faculty + " обладает бельшей силой трансгрессирования чем " + this.student+" с "+ this.faculty);
    }
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && distance == hogwarts.distance && Objects.equals(student, hogwarts.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, magic, distance);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                " faculty='"+
                " student='" + student + '\'' +
                ", magic=" + magic +
                ", distance=" + distance +
                '}';
    }
}
