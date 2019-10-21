package second_task;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    public Text(Sentence... sentences) {
        this.sentences = new ArrayList<>();
        for(Sentence sentence: sentences) {
            this.sentences.add(sentence);
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for(Sentence sentence:sentences) {
            buffer.append(sentence.toString());
        }
        return buffer.toString();
    }
}
