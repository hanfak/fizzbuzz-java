package infrastructure.printers;

import infrastructure.FizzbuzzPrinter;

import java.util.stream.IntStream;

public class FizzbuzzConsolePrinter implements FizzbuzzPrinter {
    private final Evaluator evaluator;

    public FizzbuzzConsolePrinter(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    @Override
    public void print(int to, int from) {
        System.out.println("Using Console Printer");
        IntStream.rangeClosed(to, from)
                .mapToObj(evaluator::evaluate)
                .forEach(System.out::println);
    }
}
