public class LargestSeriesProductCalculator {

    private String stringOfDigits;

    public LargestSeriesProductCalculator(String stringOfDigits) {
        validateStringOfDigits(stringOfDigits);
        this.stringOfDigits = stringOfDigits;
    }

    public long calculateLargestProductForSeriesLength(int contigiousLength) {

        validateContigousLength(contigiousLength);

        long currentContigousProduct = 1;
        long largestProduct = 0;

        for(int startIndex = 0; startIndex <= stringOfDigits.length(); startIndex++) {
            int endIndex = startIndex + contigiousLength;
            if(endIndex <= stringOfDigits.length()) {
                String currentDigitString = stringOfDigits.substring(startIndex, endIndex);
                char[] digits = currentDigitString.toCharArray();
                for (char digit : digits) {
                    currentContigousProduct = currentContigousProduct * Character.getNumericValue(digit);
                }
            }
            if(currentContigousProduct > largestProduct) {
                largestProduct = currentContigousProduct;
            }
            currentContigousProduct = 1;
        }
        return largestProduct;
    }


    private void validateContigousLength(int contigousLength) {
        if(contigousLength > stringOfDigits.length()) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if(contigousLength < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
    }

    private void validateStringOfDigits(String stringOfDigits) {
        if(stringOfDigits == null){
            throw new IllegalArgumentException("String to search must be non-null.");
        }
        if(!stringOfDigits.matches("([0-9]|[''])+")) {
            throw new IllegalArgumentException("String to search may only contains digits.");
        }
    }
}
