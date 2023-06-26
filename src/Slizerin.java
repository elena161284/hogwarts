public class Slizerin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int  thirstForPower;

    public Slizerin(String student, String faculty, int magic, int distance,
                    int cunning, int determination, int ambition,
                    int resourcefulness, int thirstForPower) {
        super(student, faculty, magic, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public int sum() {
        return cunning+determination+ambition+resourcefulness+thirstForPower;
    }
    public void compare(Slizerin o) {
        if (sum() > o.sum()) {
            System.out.println(getStudent()+" лучший слизеринец чем "+o.getStudent());
        } else if (sum() == o.sum()) {
            System.out.println(getStudent() + " и " + o.getStudent() + " обладают равными навыками слизеринца.");
        } else {
            System.out.println(o.getStudent()+" лучший слизеринец чем "+ getStudent());
        }
    }
}
