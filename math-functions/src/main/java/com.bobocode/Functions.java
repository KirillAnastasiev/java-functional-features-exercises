package com.bobocode;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        intFunctionMap.addFunction("abs", Math::abs);
        intFunctionMap.addFunction("sgn", i -> (int) Math.signum(i));
        intFunctionMap.addFunction("increment", Math::incrementExact);
        intFunctionMap.addFunction("decrement", Math::decrementExact);
        intFunctionMap.addFunction("square", i -> i * i);

        return intFunctionMap;
    }
}
