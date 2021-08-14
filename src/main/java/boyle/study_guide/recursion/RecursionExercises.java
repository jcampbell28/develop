package boyle.study_guide.recursion;

import org.springframework.stereotype.Component;

@Component
public class RecursionExercises {

    // factorial
    // 5! = 5*4*3*2*1 = 120
    public int factorial(int n){
        if (n == 1){
            System.out.println("factorial of " + n + " = 1");
            return 1;
        }
        System.out.println("factorial of " + n + " = ");
        return n * factorial(n-1);
    }

    public String test(String s){
        return s;
    }

}
