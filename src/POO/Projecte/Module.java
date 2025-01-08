package POO.Projecte;

import java.util.ArrayList;

class Module {
    private int idModule;
    private String nameModule;
    private ArrayList<Teacher> teachers;

    public Module(int idModule, String nameModule) {
        this.idModule = idModule;
        this.nameModule = nameModule;
        this.teachers = new ArrayList<>();
    }

    public String getNameModule() {
        return nameModule;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}