package second_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> words;

    public Sentence(Word... words) {
        this.words = new ArrayList<>();
        for(Word word : words) {
            this.words.add(word);
        }
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for(Word word:words) {
            buffer.append(word.toString()+" ");
        }
        return buffer.toString()+". ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
