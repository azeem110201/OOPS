import java.util.List;
import java.util.ArrayList;

class Institution {
    private String name;
    private List<Teachers> teachers;

    Institution(String name, List<Teachers> teachers) {
        this.name = name;
        this.teachers = teachers;
    }

    public List<Teachers> getTeachers() {
        return this.teachers;
    }

    public String getInstitutionName() {
        return this.name;
    }
}

class Teachers {
    private String name;
    private String subject;

    Teachers(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "[" + name + "] is incharge of " + subject;
    }

}

class Aggregation {
    public static void main(String[] args) {
        List<Teachers> teachers = new ArrayList<>();
        teachers.add(new Teachers("abc", "data structures"));
        teachers.add(new Teachers("xyz", "python"));
        teachers.add(new Teachers("pqr", "java"));

        Institution institution = new Institution("mjcet", teachers);

        List<Teachers> teachersList= institution.getTeachers();

        for(int i = 0; i < teachersList.size(); i++){
            System.out.println(teachersList.get(i));
        }

    }

}
