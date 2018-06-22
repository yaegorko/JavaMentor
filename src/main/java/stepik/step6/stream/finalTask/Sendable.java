package stepik.step6.stream.finalTask;

public interface Sendable<T> {

     String getFrom();

     String getTo();

     T getContent();

}
