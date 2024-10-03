package session_17_lambda;

@FunctionalInterface
public interface StringProcessor {
    String process(String str);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
