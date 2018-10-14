package wiring;

import domain.FizzbuzzRules.FizzbuzzStandardRules;
import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion0;
import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion1;
import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion2;
import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion3;
import infrastructure.FizzbuzzPrinter;
import infrastructure.printers.Evaluator;
import infrastructure.printers.FizzbuzzConsolePrinter;

public class Main {

    public static void main(String[] args) {
        Evaluator evaluator = fizzbuzzEvaluatorFactory(3);
        FizzbuzzPrinter printer = new FizzbuzzConsolePrinter(evaluator);
        printer.print(1,20);
    }

    private static Evaluator fizzbuzzEvaluatorFactory(int version) {
        switch (version) {
            case(0):
                System.out.println("Using evaluator version 0");
                return new FizzbuzzEvaluatorVersion0();
            case(1):
                System.out.println("Using evaluator version 1");
                return new FizzbuzzEvaluatorVersion1();
            case(2):
                System.out.println("Using evaluator version 2");
                return new FizzbuzzEvaluatorVersion2();
            case(3):
                System.out.println("Using evaluator version 3");

                // Rules factory
                return new FizzbuzzEvaluatorVersion3(new FizzbuzzStandardRules());
            default: {
                System.out.println("No version, defaulting to version 0");
                return new FizzbuzzEvaluatorVersion0();
            }
        }
    }
}
