import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "3");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", "2");
        questions[2] = new Question(3, "Who wrote 'Hamlet'?", "Charles Dickens", "William Shakespeare", "Mark Twain", "Leo Tolstoy", "2");
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic", "Indian", "Pacific", "Arctic", "3");
        questions[4] = new Question(5, "What is the square root of 64?", "6", "7", "8", "9", "3");
    }


    public void playQuiz(){
        int i=0;
        for (Question q: questions){
            System.out.println("***************************************");
            System.out.println("Question No. " + q.getId() + ": " + q.getQuestion());
            System.out.println("***************************************");
            System.out.println("1) " + q.getOp1());
            System.out.println("2) " +q.getOp2());
            System.out.println("3) " +q.getOp3());
            System.out.println("4) " +q.getOp4());
            System.out.print("\nYour answer : ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
            System.out.println("\n");
        }

        System.out.println("=== Quiz Completed! Your Answers ===\n");
        for (String s: selection){
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for(int i=0; i<questions.length;i++){
            Question que = questions[i];
            String actualAns = que.getAnswer();
            String userAns = selection[i];

            if(actualAns.equals(userAns)){
                score++;
            }
        }
        System.out.println("\nObtained Scores : " + score);
    }
}
