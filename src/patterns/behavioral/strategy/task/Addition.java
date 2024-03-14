package patterns.behavioral.strategy.task;

public class Addition implements Operations{
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
