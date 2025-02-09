package Collections.HashSet.Ex4;

class Player {
    private String name;
    private String role;

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', role='" + role + "'}";
    }
}