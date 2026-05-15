package le21;

public class Question {
    String text;
    private Question(String text) {
        this.text = text;
    }
    public static Question toQuestion(String line) {
        return new Question(line);
    }

    @Override
    public String toString() {
        return "\\textbf{" + this.text + "}\\\\";
    }
}