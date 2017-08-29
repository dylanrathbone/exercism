public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int i) {
        int squareOfSumTo = 0;
        for(int z = 1; z<=i; z++) {
            squareOfSumTo =  squareOfSumTo + z;
        }
        return squareOfValue(squareOfSumTo);
    }

    public int computeSumOfSquaresTo(int i) {
        int sumOfSquaresTo = 0;
        for(int z = 1; z<=i; z++) {
            sumOfSquaresTo =  sumOfSquaresTo + squareOfValue(z);
        }
        return sumOfSquaresTo;
    }

    public int computeDifferenceOfSquares(int i) {
        return computeSquareOfSumTo(i) - computeSumOfSquaresTo(i);
    }

    private int squareOfValue(int value) {
        return (int)Math.pow(value, 2);
    }
}
