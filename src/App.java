import Model.Human;
import Model.Problem.EasyProblem;

public class App {
    public static void main(String[] args) throws Exception {
        Human oat = new Human();

        EasyProblem easy = new EasyProblem();
        oat.solving(easy);

    }
}
