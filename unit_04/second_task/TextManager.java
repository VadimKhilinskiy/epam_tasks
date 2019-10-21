package second_task;

public class TextManager {
    private Text text;

    public TextManager(Text text) {
        this.text = text;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public TextManager() {
    }

    public void addSentence(Sentence sentence){
        text.getSentences().add(sentence);
    }

    public void addWordInSentence(Word word, Sentence sentence) {
        for(Sentence sentenceInText: text.getSentences()) {
            if(sentence.equals(sentenceInText)) {
                sentenceInText.getWords().add(word);
                return;
            }
        }
    }

    public void addSymbolInWord(Character character, Word word, Sentence sentence){
        for(Sentence sentenceInText: text.getSentences()){
            if(sentence.equals(sentenceInText)){
                for(Word wordInSentence : sentenceInText.getWords()) {
                    if(word.equals(wordInSentence)){
                        wordInSentence.setChars(wordInSentence.getChars()+character);
                    }
                }
            }


        }
    }


}
