public class PangramChecker {

    public boolean isPangram(String input) {
       String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Integer found = 0;
        for (int i = 0; i<alphabet.length(); i++) {
            char matcher = alphabet.charAt(i);
            for(int x = 0; x<input.toLowerCase().trim().length(); x++) {
                char target = input.toLowerCase().trim().charAt(x);
                if(target == matcher) {
                    found++;
                    break;
                }
            }
        }
        return (found.equals(26));
    }
}
