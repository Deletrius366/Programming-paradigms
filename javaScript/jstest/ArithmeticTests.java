package javaScript.jstest;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class ArithmeticTests extends VariablesTests {{
    binary("+", (a, b) -> a + b);
    binary("-", (a, b) -> a - b);
    binary("*", (a, b) -> a * b);
    binary("/", (a, b) -> a / b);
    unary("negate", a -> -a);

    tests(
            c(10),
            vx,
            vy,
            vz,
            f("+", vx, c(2)),
            f("-", c(3), vy),
            f("*", c(4), vz),
            f("/", c(5), vz),
            f("/", f("negate", vx), c(2)),
            f("/", vx, f("*", vy, vz)),
            f("+", f("+", f("*", vx, vx), f("*", vy, vy)), f("*", vz, vz)),
            f("-", f("+", f("*", vx, vx), f("*", c(5), f("*", vz, f("*", vz, vz)))), f("*", vy, c(8)))
    );
}}
