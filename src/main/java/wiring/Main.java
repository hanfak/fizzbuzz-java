package wiring;

import infrastructure.FizzbuzzPrinter;
import infrastructure.printers.Evaluator;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static wiring.Wiring.fizzbuzzConsolePrinter;
import static wiring.Wiring.fizzbuzzEvaluatorFactory;

public class Main {

    public static void main(String[] args) {
        if (args.length < 2 || numberOfArguments(args) == 0) {
            runDefaults();
        } else {
            runWithRuntimeArguments(args);
        }
    }

    private static long numberOfArguments(String[] args) {
        try {
            return Arrays.stream(args).map(Integer::parseInt).count();
        } catch (NumberFormatException e) {
            runDefaults();
            return 0;
        }
    }

    private static void runDefaults() {
        Evaluator evaluator = fizzbuzzEvaluatorFactory(3);
        FizzbuzzPrinter printer = fizzbuzzConsolePrinter(evaluator);
        printer.print(1, 30);
    }

    private static void runWithRuntimeArguments(String[] args) {
        if (args.length == 4) {
            Evaluator evaluator = fizzbuzzEvaluatorFactory(parseInt(args[0]), parseInt(args[1]));
            FizzbuzzPrinter printer = fizzbuzzConsolePrinter(evaluator);
            printer.print(parseInt(args[2]), parseInt(args[3]));
        }

        if (args.length == 3) {
            Evaluator evaluator = fizzbuzzEvaluatorFactory(parseInt(args[0]));
            FizzbuzzPrinter printer = fizzbuzzConsolePrinter(evaluator);
            printer.print(parseInt(args[1]), parseInt(args[2]));
        }

        if (args.length == 2) {
            Evaluator evaluator = fizzbuzzEvaluatorFactory(parseInt(args[0]), parseInt(args[1]));
            FizzbuzzPrinter printer = fizzbuzzConsolePrinter(evaluator);
            printer.print(1, 30);
        }
    }
}
