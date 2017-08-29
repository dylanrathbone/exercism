import java.util.HashMap;

class Scrabble {

    private String word;
    private HashMap<Character, Integer> scrabbleWordScores=new HashMap<>();

    Scrabble(String word) {
        this.word = word.toUpperCase();
        scrabbleWordScores.put('A', 1);
        scrabbleWordScores.put('B', 3);
        scrabbleWordScores.put('C', 3);
        scrabbleWordScores.put('D', 2);
        scrabbleWordScores.put('E', 1);
        scrabbleWordScores.put('F', 4);
        scrabbleWordScores.put('G', 2);
        scrabbleWordScores.put('H', 4);
        scrabbleWordScores.put('I', 1);
        scrabbleWordScores.put('J', 8);
        scrabbleWordScores.put('K', 5);
        scrabbleWordScores.put('L', 1);
        scrabbleWordScores.put('M', 3);
        scrabbleWordScores.put('N', 1);
        scrabbleWordScores.put('O', 1);
        scrabbleWordScores.put('P', 3);
        scrabbleWordScores.put('Q', 10);
        scrabbleWordScores.put('R', 1);
        scrabbleWordScores.put('S', 1);
        scrabbleWordScores.put('T', 1);
        scrabbleWordScores.put('U', 1);
        scrabbleWordScores.put('V', 4);
        scrabbleWordScores.put('W', 4);
        scrabbleWordScores.put('X', 8);
        scrabbleWordScores.put('Y', 4);
        scrabbleWordScores.put('Z', 10);
    }

    int getScore() {
        int scrabbleScore = 0;
        char[] wordAsChars = word.toCharArray();
        for(Character character : wordAsChars) {
            scrabbleScore += scrabbleWordScores.get(character);
        }
        return scrabbleScore;
    }
}
