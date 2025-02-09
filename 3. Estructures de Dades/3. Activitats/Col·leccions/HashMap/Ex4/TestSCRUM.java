package Collections.HashMap.Ex4;

public class TestSCRUM {
    public static void main(String[] args) {
        SCRUM scrumManager = new SCRUM();

        Student student1 = new Student("S001", "Èrik Brak");
        Student student2 = new Student("S002", "Victor Calvo");
        Student student3 = new Student("S003", "Serhii Escudero");
        Student student4 = new Student("S004", "Melina Turtsanash");

        scrumManager.addProject("Projecte A");
        scrumManager.addProject("Projecte B");

        scrumManager.addStudent("Projecte A", student1);
        scrumManager.addStudent("Projecte A", student2);
        scrumManager.addStudent("Projecte B", student3);
        scrumManager.addStudent("Projecte B", student4);

        scrumManager.addStudent("Projecte A", student2);
        scrumManager.showProjects();
        scrumManager.removeStudent("Projecte A", "S001");
        scrumManager.showProjects();
        scrumManager.removeProject("Projecte A");
        scrumManager.showProjects();
        scrumManager.removeProject("Projecte C");
    }
}
