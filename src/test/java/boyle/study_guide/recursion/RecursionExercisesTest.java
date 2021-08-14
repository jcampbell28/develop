package boyle.study_guide.recursion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RecursionExercises.class)
public class RecursionExercisesTest {

    private RecursionExercises recursionExercises = new RecursionExercises();

    @Test
    public void factorialTest(){
       // RecursionExercises recursionExercises = new RecursionExercises();
        Assert.assertEquals(recursionExercises.factorial(5), 120);
    }

    @Test
    public void stringTest(){
        Assert.assertEquals(recursionExercises.test("hi"), "hi");
    }
}