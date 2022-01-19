public class Task {
    protected final String taskName;
    protected boolean taskComplete;

    public Task(String taskName) {
        this.taskName = taskName;
        this.taskComplete = false;
    }

    public String getStatusIcon() {
        return (taskComplete ? "X" : " ");
    }

    public void markAsComplete() {
        this.taskComplete = true;
    }

    public void markAsIncomplete() {
        this.taskComplete = false;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.taskName;
    }
}