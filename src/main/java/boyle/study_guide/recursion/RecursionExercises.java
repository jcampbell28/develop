package boyle.study_guide.recursion;

import org.springframework.stereotype.Component;

@Component
public class RecursionExercises {

    // A factorial is the product of an integer and all the integers below it;
    // e.g. factorial four ( 4! ) is equal to 24.
    // 5! = 5*4*3*2*1 = 120
    public int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    /*
    * To count the number of elements in a list:
        If the list is empty, return zero; otherwise,
        the count is 1 + the count applied to the rest of the list
*/
    public int countNumberOfElements(int [] elements){
    int count = elements.length;
        if (elements.length == 0) {
            return 0;
        }
        else {
            return (countNumberOfElements(elements) + elements[count-1]);
        }
    }

    public String test(String s){
        return s;
    }

}
