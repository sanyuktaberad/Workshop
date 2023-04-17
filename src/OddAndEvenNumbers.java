import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OddAndEvenNumbers {
        public static void main (String[] args){
            List <Integer> Numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

            List <Integer> OddNumbers = Numbers.stream().filter(o -> o%2 !=0).toList();

            List <Integer> EvenNumbers = Numbers.stream().filter(o -> o%2 ==0).toList();

            System.out.println("Odd numbers in the list are " + OddNumbers);

            System.out.println("Even numbers in the list are "+ EvenNumbers);

            List <Integer> Numbers1 = Arrays.asList(10, 1, 2, 3, 4, 5, 6, 7, 8, 9);

            List <Integer> AcendingOrder = Numbers1.stream().sorted().toList();
            System.out.println("Accending order of arraylist is " + AcendingOrder);

            List <Integer> DecendingOrder = Numbers1.stream().sorted(Comparator.reverseOrder()).toList();
            System.out.println("Decending order of arraylist is " + DecendingOrder);

            List <Integer> maximum = Collections.singletonList(Numbers1.stream().max(Integer::compare).get());
            System.out.println("Maximum number in list" + maximum);

            List <Integer> minimum = Collections.singletonList(Numbers1.stream().min(Integer::compare).get());
            System.out.println("Minimum number in list" + minimum);
        }
}

