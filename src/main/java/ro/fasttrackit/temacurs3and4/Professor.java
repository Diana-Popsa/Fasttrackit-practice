package ro.fasttrackit.temacurs3and4;

public class Professor implements Human {
    private int ranking;
    private ProfessorType type;
    private int age;

    public ProfessorType getType() {
        return type;
    }

    public void setType(ProfessorType type) {
        this.type = type;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public ScholarType getScholarType() {
        return type;
    }


    public static void main(String[] args) {
        Professor alex = new Professor();
        alex.setType(ProfessorType.ASSOCIATE);
        System.out.println("Alex is an " + alex.getType() + " professor.");
    }
}

