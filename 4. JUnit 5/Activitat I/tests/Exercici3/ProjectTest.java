package Exercici3;

import Exercici3.Project;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProjectTest {

    @Test
    void constructor() {
        Project project = new Project("SCRUM", 12000);
        assertEquals("SCRUM", project.getTitle());
        assertEquals(12000, project.getBudget());
        assertFalse(project.isCompleted());
    }
}