class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        for(String string : phrase.split(" |\\-")) {
            acronym.append(string.toUpperCase().charAt(0));
        }
        return acronym.toString();
    }
}
