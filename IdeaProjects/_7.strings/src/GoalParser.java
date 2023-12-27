public class GoalParser {
    //https://leetcode.com/problems/goal-parser-interpretation/description/
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
    public static String interpret(String command) {
        command = command.replace("G","G");
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        return command;
    }
}
