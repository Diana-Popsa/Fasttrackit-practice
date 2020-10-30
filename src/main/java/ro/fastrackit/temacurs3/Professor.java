package ro.fastrackit.temacurs3;

import java.time.LocalDate;

public class Professor implements Human {
    private int ranking;
    private ProfessorType type;

    public ProfessorType getType() {
        return type;
    }

    public void setType(ProfessorType type) {
        this.type = type;
    }

    @Override
    public int getAge() {
        return 40;
    }

    @Override
    public ScholarType getScholarType() {
        return null;
    }


    public static void main(String[] args) {
        Professor alex = new Professor();
        alex.setType(ProfessorType.ASSOCIATE);
        System.out.println("Alex is an " + alex.getType() + " professor.");
    }
}

