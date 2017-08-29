class LuhnValidator {

    String validCandidate;

    boolean isValid(String candidate) {

        if(candidate.length() <= 1){
            return false;
        }

        validCandidate = candidate.trim();
        String[] chars = validCandidate.split("\\d+");

        for(int i = chars.length; i > 0; i--){
            System.out.println(chars[i-2]);
        }

        return false;
    }
}