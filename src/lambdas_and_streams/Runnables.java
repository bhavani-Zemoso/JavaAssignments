package lambdas_and_streams;

import java.util.concurrent.Callable;

public class Runnables {
    public void methodAcceptingRunnable(Runnable r) {}

    public void methodAcceptingCallable(Callable c) {}

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello, Runnable");

        new Runnables().methodAcceptingRunnable(runnable);

        new Runnables().methodAcceptingRunnable(() -> {
            System.out.println("Complex lambda");
            persist();
            email();
        });

        Callable callable = () -> "Hello, Callable";

        new Runnables().methodAcceptingCallable(callable);

        new Runnables().methodAcceptingCallable(() -> {
            return "Hello!";
        });


    }

    private static void email() {
    }

    private static void persist() {
    }

    interface Tradable<Trade>
    {
        boolean check(Trade t);
    }

    // Tradable<Trade> bigTradeLamda = (Trade trade) -> trade.isBigTrade();
}
