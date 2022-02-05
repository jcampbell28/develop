package boyle.study_guide.recursion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RecursionExercises.class)
public class RecursionExercisesTest {

    @Autowired
    RecursionExercises recursionExercises;

    @Test
    public void factorialTest(){
        Assert.assertEquals(recursionExercises.factorial(5), 120);
    }

    @Test
    public void countNumberOfElementsTest(){
        int[] elements = {1,2,3};
        Assert.assertEquals(recursionExercises.countNumberOfElements(elements), 1);
    }

    @Test
    public void stringTest(){
        Assert.assertEquals(recursionExercises.test("hi"), "hi");
    }
}