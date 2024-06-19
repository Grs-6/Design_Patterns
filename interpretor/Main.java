public class Main {
    public static void main(String[] args) {
        String expression = "3 + 5 * 2";
        Expression parsedExpression = ExpressionParser.parse(expression);
        System.out.println("Result: " + parsedExpression.interpret());

        expression = "(10 + 2) * 8 - 3";
        parsedExpression = ExpressionParser.parse(expression);
        System.out.println("Result: " + parsedExpression.interpret());
    }
}
