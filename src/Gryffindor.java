import java.sql.SQLOutput;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String student, String faculty, int magic, int distance, int nobility, int honor, int bravery) {
        super(student, faculty, magic, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sum() {
        return nobility+honor+bravery;
    }
    public void compare(Gryffindor o) {
        if (sum() > o.sum()) {
            System.out.println(getStudent()+" лучший гриффиндорец чем "+o.getStudent());
        } else if (sum() == o.sum()) {
            System.out.println(getStudent() + " и " + o.getStudent() + " обладают равными навыками гриффиндорца.");
        } else {
            System.out.println(o.getStudent()+" лучший гриффиндорец чем "+ getStudent());
        }
        }
    }