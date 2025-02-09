package POO.ProjecteNadal;

import java.util.*;

class Cycle {
    private String name;
    private Map<Integer, List<Module>> courses;

    public Cycle(String name) {
        this.name = name;
        this.courses = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addModule(int year, Module module) {
        courses.putIfAbsent(year, new ArrayList<>());
        courses.get(year).add(module);
    }

    public List<Module> getModulesByYear(int year) {
        return courses.getOrDefault(year, new ArrayList<>());
    }

    public Set<Integer> getAvailableYears() {
        return courses.keySet();
    }
}
