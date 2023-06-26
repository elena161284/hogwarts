public class Kogtevpan extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevpan(String student, String faculty, int magic, int distance,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(student, faculty, magic, distance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int sum() {
        return intelligence+wisdom+wit+creativity;
    }
    public void compare(Kogtevpan o) {
        if (sum() > o.sum()) {
            System.out.println(getStudent()+" лучший когтевранец чем "+o.getStudent());
        } else if (sum() == o.sum()) {
            System.out.println(getStudent() + " и " + o.getStudent() + " обладают равными навыками когтевранеца.");
        } else {
            System.out.println(o.getStudent()+" лучший когтевранец чем "+ getStudent());
        }
    }
}
