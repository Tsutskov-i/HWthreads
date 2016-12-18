package ru.sbt.threads;

public interface ExecutionManager {
    Context execute(Runnable callback, Runnable... tasks);
}
