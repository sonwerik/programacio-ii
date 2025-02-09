package Collections.HashMap.Ex3;

class Student {
    private String idStudent;
    private String name;
    private int age;

    public Student(String idStudent, String name, int age) {
        this.idStudent = idStudent;
        this.name = name;
        this.age = age;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}