public class Main {
    public static void main(String[] args) {
        String entryData = InputEntry.getEntry();
        try {
            Expression expression = new Expression(entryData);
            while (!expression.getAction().equals(MathAction.STOP)) {
                System.out.println(expression.getAction().calculate(expression.getX(), expression.getY()));
                entryData = InputEntry.getEntry();
                expression = new Expression(entryData);
            }
        } catch (NumberFormatException | IncorrectInput ex) {
            System.out.println("Некорректный ввод");
            ex.printStackTrace();
        }
    }
}
