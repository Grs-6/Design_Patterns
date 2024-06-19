import java.util.Stack;

public class ExpressionParser {
    public static Expression parse(String expression) {
        Stack<Expression> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isWhitespace(ch)) {
                continue;
            }

            if (Character.isDigit(ch)) {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    sb.append(expression.charAt(i++));
                }
                i--;
                values.push(new Number(Integer.parseInt(sb.toString())));
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    private static Expression applyOperator(char operator, Expression right, Expression left) {
        switch (operator) {
            case '+':
                return new Add(left, right);
            case '-':
                return new Subtract(left, right);
            case '*':
                return new Multiply(left, right);
            case '/':
                return new Divide(left, right);
            default:
                throw new UnsupportedOperationException("Unsupported operator: " + operator);
        }
    }
}
