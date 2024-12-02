package POO.Exemple2;

public class User {
    private String name;
    private String email;
    private int id;

    private static int numberOfUsers = 0;
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = numberOfUsers++;

        validateEmail();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    boolean validateEmail() {
        return true;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    @Override
    public String toString() {
        return "\nUser " + id + ": \nName: " + name + "\nEmail: " + email;
    }
}
