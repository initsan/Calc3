public enum MathAction implements Calc{
    STOP{
        @Override
        public double calculate(double x, double y) {
            return 0;
        }
    }
    ,
    ADD {
        @Override
        public double calculate(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT {
        @Override
        public double calculate(double x, double y) {
            return x-y;
        }
    },
    MULTIPLY {
        @Override
        public double calculate(double x, double y) {
            return x*y;
        }
    },
    DIVIDE {
        @Override
        public double calculate(double x, double y) {
            try {
                return x/y;
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя");
            }
            return 0;
        }
    },
    FACTORIAL {
        @Override
        public double calculate(double x, double y) {
            int result = 1;
            for(int i=1; i<=x; i++){
                result *= i;
            }
            return result;
        }
    };

    public static MathAction getAction(String parseDatum) throws IncorrectInput {
        switch (parseDatum) {
            case "q":
                return STOP;
            case "+":
                return ADD;
            case "-":
                return SUBTRACT;
            case "*":
                return MULTIPLY;
            case "/":
                return DIVIDE;
            case "!":
                return FACTORIAL;
            default:
                throw new IncorrectInput("Некорректный ввоз арифметического действия");
        }
    }


}
