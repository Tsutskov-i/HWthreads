package ru.sbt.threads;

public interface Context {
    /**
     * Метод getCompletedTaskCount() возвращает количество тасков, которые на текущий момент успешно выполнились.
     * @return
     */
    int getCompletedTaskCount();
    int getFailedTaskCount();
    int getInterruptedTaskCount();
    void interrupt();
    boolean isFinished();
}
