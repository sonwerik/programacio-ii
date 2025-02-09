package POO.ProjecteNadal;

import java.util.ArrayList;
import java.util.List;

class Module {
    private String name;
    private List<Professor> professors;

    public Module(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Professor> getProfessors() {
        return professors;
    }
}
