package stepik.step6.stream.finaltask;

public interface Sendable<T> {

     String getFrom();

     String getTo();

     T getContent();

}
