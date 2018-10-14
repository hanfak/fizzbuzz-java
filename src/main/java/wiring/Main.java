package wiring;

import domain.FizzbuzzRules.FizzbuzzAdditionalRules;
import domain.FizzbuzzRules.FizzbuzzStandardRules;
import domain.fizzbuzzevaluators.*;
import infrastructure.FizzbuzzPrinter;
import infrastructure.printers.Evaluator;
import infrastructure.printers.FizzbuzzConsolePrinter;

public class Main {

    public static void main(String[] args) {
        Evaluator evaluator = fizzbuzzEvaluatorFactory(3);
        FizzbuzzPrinter printer = new FizzbuzzConsolePrinter(evaluator);
        printer.print(1,20);

//        Evaluator evaluator = fizzbuzzEvaluatorFactory(3, 1);
//        FizzbuzzPrinter printer = new FizzbuzzConsolePrinter(evaluator);
//        printer.print(1,40);
    }

    private static Evaluator fizzbuzzEvaluatorFactory(int version, int rulesVersion) {
        switch (version) {
            case(0):
                System.out.println("Using evaluator version 0");
                System.out.println("Using rules version 0");
                return new FizzbuzzEvaluatorVersion0();
            case(1):
                System.out.println("Using evaluator version 1");
                System.out.println("Using rules version 0");
                return new FizzbuzzEvaluatorVersion1();
            case(2):
                System.out.println("Using evaluator version 2");
                System.out.println("Using rules version 0");
                return new FizzbuzzEvaluatorVersion2();
            case(3):
                System.out.println("Using evaluator version 3");
                Rules rule = rulesFactory(rulesVersion);
                return new FizzbuzzEvaluatorVersion3(rule);
            default: {
                System.out.println("No version, defaulting to version 0");
                return new FizzbuzzEvaluatorVersion0();
            }
        }
    }

    private static Rules rulesFactory(int rulesVersion) {
        switch (rulesVersion) {
            case(0):
                System.out.println("Using rules version 0");
                return new FizzbuzzStandardRules();
            case(1):
                System.out.println("Using rules version 1");
                return new FizzbuzzAdditionalRules();
            default: {
                System.out.println("No rules version, defaulting to version 0");
                return new FizzbuzzStandardRules();
            }
        }    }

    private static Evaluator fizzbuzzEvaluatorFactory(int version) {
        return fizzbuzzEvaluatorFactory(version, 0);
    }
}
