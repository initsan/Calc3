public class Expression {
    private double x;
    private double y;
    MathAction action;

    public Expression(String data) throws IncorrectInput {
        String[] parseData = data.split(" ");
        if (data.contains("q")) {
            action = MathAction.STOP;

        } else if (data.contains("!")) {
            x = Double.parseDouble(data.split("!")[0]);
            y = 0;
            action = MathAction.FACTORIAL;

        } else {
            x = Double.parseDouble(parseData[0]);
            y = Double.parseDouble(parseData[2]);
            action = MathAction.getAction(parseData[1]);
        }

    }

    public MathAction getAction() {
        return action;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
