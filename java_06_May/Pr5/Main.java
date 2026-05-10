
abstract class Exam {

    abstract void evaluate();
}

class MCQExam extends Exam {

    double marksPerQuestion;
    double correctAnswers;

    MCQExam(double marksPerQuestion, double correctAnswers) {
        this.marksPerQuestion = marksPerQuestion;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void evaluate() {
        double totalScore = marksPerQuestion * correctAnswers;
        System.out.println("Correct Answer: " + correctAnswers + ", Total Score: " + totalScore);
    }
}

class CodingExam extends Exam {

    double passedTestCases;
    double marksPerTestCase;

    CodingExam(double passedTestCases, double marksPerTestCase) {
        this.passedTestCases = passedTestCases;
        this.marksPerTestCase = marksPerTestCase;
    }

    @Override
    public void evaluate() {
        double totalScore = marksPerTestCase * passedTestCases;
        System.out.println("Correct coding answer: " + passedTestCases + ", Total Score: " + totalScore);
    }
}

public class Main {

    public static void main(String[] args) {
        Exam e;

        e = new MCQExam(2.5, 25);
        e.evaluate();

        e = new CodingExam(4, 1.5);
        e.evaluate();
    }
}
