package Exercici3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void constructor() {
        Client client = new Client("Èrik", "sonwerik@gmail.com");
        assertEquals("Èrik", client.getName());
        assertEquals("sonwerik@gmail.com", client.getEmail());
        assertEquals(0, client.getProjects().size());
    }

    @Test
    void addProject() {
        Client client = new Client("Èrik", "sonwerik@gmail.com");
        Project project = new Project("SCRUM" ,12000);
        client.addProject(project);
        assertEquals(1, client.getProjects().size());
    }

    @Test
    void removeProject() {
        Client client = new Client("Èrik", "sonwerik@gmail.com");
        Project project = new Project("SCRUM" ,12000);
        client.addProject(project);
        client.removeProject("SCRUM");
        assertEquals(0, client.getProjects().size());
        assertFalse(client.removeProject("SCRUM"));
    }

    @Test
    void getTotalBudget() {
        Client client = new Client("Èrik", "sonwerik@gmail.com");
        Project project1 = new Project("SCRUM" ,12000);
        Project project2 = new Project("BBDD" ,5000);
        client.addProject(project1);
        client.addProject(project2);
        assertEquals(17000, client.getTotalBudget());
    }
}