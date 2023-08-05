package chapter12.generics;

public class OptionalEx<T> {
    OptionalEx<?> wopt = new OptionalEx<Object>();
    OptionalEx<Object> oopt = new OptionalEx<Object>();

    OptionalEx<String> sopt = (OptionalEx<String>) wopt;

}
