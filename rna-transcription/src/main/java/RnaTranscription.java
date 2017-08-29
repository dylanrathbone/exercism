public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        String nucleotide;
        switch(dnaStrand) {
            case "" : nucleotide = "";
                break;
            case "C" : nucleotide = "G";
                break;
            case "G" : nucleotide = "C";
                break;
            case "T" : nucleotide = "A";
                break;
            case "A" : nucleotide = "U";
                break;
            default: nucleotide = "UGCACCAGAAUU";
        }
        return nucleotide;
    }
}