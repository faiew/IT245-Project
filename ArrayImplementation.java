
public class Task {

    private int taskId;
    private String taskName;
    private int priority;
    private int arrivalOrder;


    public Task(int taskId, String taskName, int priority, int arrivalOrder) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;

    }


    public String getTaskName() {
        return taskName;
    }


    public int getPriority() {
        return priority;
    }


    public int getArrivalOrder() {
        return arrivalOrder;
    }


    @Override
    public String toString() {

        return "Task ID: " + taskId +
                ", Name: " + taskName +
                ", Priority: " + priority +
                ", Arrival Order: " + arrivalOrder;

    }

}


