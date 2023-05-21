import java.util.Stack;

public class Learnstack {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("horse");
        animals.push("giraffe");
        animals.push("cat");

        System.out.println("Stack:" + animals);

        System.out.println(animals.peek());

        animals.pop();
        System.out.println(animals.peek());
    }

}
