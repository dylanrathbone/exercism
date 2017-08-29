import java.util.*;

class SumOfMultiples {

    private int number;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        Set<Integer> multiples = new HashSet<>();
        for(int i = 0; i < set.length; i++) {
            for(int z = 1; z < number; z++) {
                if(z % set[i] == 0) {
                    multiples.add(z);
                }
            }
        }
        return multiples.stream()
                .reduce(0,
                        (a, b) -> a + b);
    }

}
