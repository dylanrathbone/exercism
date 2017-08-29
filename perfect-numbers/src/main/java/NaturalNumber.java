import java.util.stream.IntStream;

class NaturalNumber {

    private int number;

    public NaturalNumber(int number) {
        if(number <= 0 ){
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    public Classification getClassification() {
        if(aliquotSum() == number) {
            return Classification.PERFECT;
        } else if (aliquotSum() > number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

    private int aliquotSum(){
        return IntStream.range(1, number)
                .parallel()
                .filter(i -> number % i == 0)
                .sum();
    }
}
