public class Model {
    private String sentence = "";

    /**
     * add string to sentence
     *
     * @param valueStr
     * @return sentence
     */
    public String addStringToSentence(String valueStr) {
        if (sentence.length() != 0) {
            sentence += " ";
        }
        sentence += valueStr;
        return sentence;
    }

    public String getSentence() {
        return sentence;
    }
}