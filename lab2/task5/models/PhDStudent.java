package lab2.task5.models;

public class PhDStudent extends Student {
    private String researchArea;

    public PhDStudent(String name, int age, String major, String researchArea) {
        super(name, age, major);
        this.researchArea = researchArea;
    }

    public String getResearchArea() { return researchArea; }

    @Override
    public String getOccupation() {
        return "PhD Student, major: " + getMajor() + ", research: " + researchArea;
    }

    @Override
    protected boolean canHavePet(Animal pet) {
        return !(pet instanceof Dog);
    }
}