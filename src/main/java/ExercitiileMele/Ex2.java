package ExercitiileMele;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println(getSquaredElementsArray(numbers));

    }

    public static List<Integer> getSquaredElementsArray (List<Integer> numbers){
        List<Integer> squaredNumbers = new ArrayList<>();
        for(Integer number : numbers){
            squaredNumbers.add(number*number);
        }
//        for (int i = 0; i < numbers.size(); i++) {
//            Integer a = numbers.get(i)*numbers.get(i);
//            numbers.set(i, a);
//
//        }
        return squaredNumbers;
    }

}
