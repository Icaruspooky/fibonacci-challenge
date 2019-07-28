import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Fibonacci {

    List<Integer> fibonacciList;

    public List<Integer> getFibonacciList() {
        return fibonacciList;
    }

    Fibonacci(Integer max) {
        this.fibonacciList = fibonacci(max);
    }

    private List<Integer> fibonacci(Integer max) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1));

        int number = 0;
        while (number <= max) {
            int size = list.size();
            number = list.get(size - 1) + list.get(size - 2);
            list.add(number);
        }
        return list;
    }
    public Boolean isFibonacci(Integer number) {
        return fibonacciList.contains(number);
    }
}