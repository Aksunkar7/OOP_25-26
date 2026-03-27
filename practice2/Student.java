package practice2;

public class Student {
    private String name;
    private String id;
    private int yearOfStudy;
    private static int studentCnt = 0;

    {
        this.studentCnt++;
    }


    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        int yearOfId = yearOfStudy % 100;
        this.id = yearOfId + "B" + studentCnt;
    }
    
    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }

    public void incYearOfStudy(){
       this.yearOfStudy++;
    }

    public int getYearOfStudy(){
        return this.yearOfStudy;
    }
    public static void main(String[] args){
        Student Aksungkar = new Student("Aks", 2024);
        Student Aks = new Student("Akssss", 2024);
        System.out.println(Aksungkar.getId());
        System.out.println(Aks.getId());
        System.out.println(Aks.getYearOfStudy());
        Aks.incYearOfStudy();
        System.out.println(Aks.getYearOfStudy());
        System.out.println(Aksungkar.getName());
        
        System.out.println(Aks.getId());


    }
}