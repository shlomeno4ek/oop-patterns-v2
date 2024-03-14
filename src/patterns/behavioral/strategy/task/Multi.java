package patterns.behavioral.strategy.task;

public class Multi implements Operations{
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
