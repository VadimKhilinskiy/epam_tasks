package second_task;

import java.util.Objects;

public class Word {

    private String chars;

    public Word(String chars) {
        this.chars = chars;
    }

    public String getChars() {
        return chars;
    }

    public void setChars(String chars) {
        this.chars = chars;
    }

    @Override
    public String toString() {
        return chars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(chars, word.chars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chars);
    }
}
