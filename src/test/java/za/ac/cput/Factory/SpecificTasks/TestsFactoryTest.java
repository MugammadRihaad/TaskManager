package za.ac.cput.Factory.SpecificTasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.SpecificTasks.Tests;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestsFactoryTest {

    private String testId;
    private String testName;
    private String dueDate;
    private boolean complete;
    private String materialId;
    //private Set<String> taskId;
    private List<String> taskId = new LinkedList<>();

    @Before
    public void setUp() throws Exception {
        this.testId = "1";
        this.testName = "ADT Chapter 1 test";
        this.dueDate = "10/03/19";
        this.complete = false;
        this.materialId = "1";
        //this.abc.add("7");
        this.taskId.add("7");
        this.taskId.add("8");
        this.taskId.add("9");
    }

    @Test
    public void buildTest() {
        Tests test = TestsFactory.buildTest(this.testId, this.testName, this.dueDate, this.complete, this.materialId, this.taskId);
        Assert.assertNotNull(test.getTestId());
        Assert.assertNotNull(test);
    }
}