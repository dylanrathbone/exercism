import java.util.stream.IntStream;

class LuhnValidator {

    boolean isValid(String candidate) {
        String trimmedCandidate = removeWhiteSpace(candidate);
        return isValidFormat(trimmedCandidate) &&
                String.valueOf(calculateS1(reverse(trimmedCandidate)) + calculateS2(reverse(trimmedCandidate))).endsWith("0");
    }

    private boolean isValidFormat(String candidate) {
        return !candidate.equals("0") && candidate.matches("[0-9 ]+");
    }

    private String removeWhiteSpace(String candidate) {
        return candidate.replaceAll("\\s+","");
    }

    private String reverse(String candidate) {
        return new StringBuilder(candidate)
                .reverse()
                .toString();
    }

    private int calculateS1(String candidate) {
        return IntStream.rangeClosed(0, candidate.length())
                .parallel()
                .filter(i -> i % 2 != 0)
                .map(i -> Integer.parseInt(Character.toString(candidate.charAt(i-1))))
                .sum();
    }

    private int calculateS2(String candidate) {
        return IntStream.rangeClosed(1, candidate.length())
                .parallel()
                .filter(i -> i % 2 == 0)
                .map(i -> Integer.parseInt(Character.toString(candidate.charAt(i-1))) * 2)
                .mapToObj(i -> Integer.toString(i).toCharArray())
                .mapToInt(i -> (i.length >= 2) ? (Character.getNumericValue(i[0]) + Character.getNumericValue(i[1])) : Character.getNumericValue(i[0]))
                .sum();
    }
}
