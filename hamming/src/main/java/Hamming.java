public class Hamming {

    private char[] lcn;
    private char[] rcn;

    Hamming(String leftStrand, String rightStrand) {
        lcn = leftStrand.toCharArray();
        rcn = rightStrand.toCharArray();
        if (lcn.length != rcn.length) {
            throw new IllegalArgumentException("Threw an IllegalArgumentException");
        }
    }

    int getHammingDistance() {
        int hammingCount = 0;
        for (int i = 0; i < lcn.length; i++) {
            if (lcn[i] != rcn[i]) {
                hammingCount++;
            }
        }
        return hammingCount;
    }
}
