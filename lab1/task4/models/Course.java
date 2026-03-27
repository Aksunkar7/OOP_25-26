package lab1.task4.models;
import java.util.List;

public class Course {
    private String name;
    private String description;
    private int credits;
    private List<String> prerequsites;

    public Course(String name, int credits, List<String> prerequisites) {
        this.name = name;
        this.credits = credits;
        this.prerequsites = prerequisites;
    }

    public Course(String name, int credits, List<String> prerequisites, String description) {
        this(name, credits, prerequisites);
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Course: " + this.name + 
                "\nCredits: " + this.credits +
                "\nPrerequisites: " + this.prerequsites +
                "\nDescription: " + this.description;
    }




}
