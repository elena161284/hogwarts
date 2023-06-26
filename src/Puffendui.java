public class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honor;

    public Puffendui(String student, String faculty, int magic, int distance, int diligence, int loyalty, int honor) {
        super(student, faculty, magic, distance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int sum() {
        return diligence+loyalty+honor;
    }
    public void compare(Puffendui o) {
        if (sum() > o.sum()) {
            System.out.println(getStudent()+" лучший пуффендоец чем "+o.getStudent());
        } else if (sum() == o.sum()) {
            System.out.println(getStudent() + " и " + o.getStudent() + " обладают равными навыками пуффендойца.");
        } else {
            System.out.println(o.getStudent()+" лучший пуффендоец чем "+ getStudent());
        }
    }
}
