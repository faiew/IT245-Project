//class to define linked task
class TaskQueueItem{
  int taskId;
  String taskName;
  TaskQueueItem next;

public TaskQueueItem(int taskId,String taskName){
  this.taskId=taskId;
  this.taskName=taskName;
  this.next=null;
}

//override
public String toString(){
  return "Task[ID="+ taskId +",Name=" +taskName +"]";
}
}

//Linked List Queue Implementation
class LinkedListQueue{
  private TaskQueueItem front;
  private TaskQueueItem rear;
  private int size;
  
//Zero argument constructor with default capacity
  public LinkedListQueue(){
    this.front=this.rear=null;
    this.size=0;
  }
  
//add tasks at the end of the queue
public void enqueue(int id,String name){
  TaskQueueItem newNode= new TaskQueueItem(id,name);
    if(isEmpty()){
    this.front=this.rear=newNode;
  }else{
    this.rear.next=newNode;
    this.rear=newNode;//update rear
  }
  size++;
  System.out.println("Task Enqueued:"+newNode);
}

// check if the queue is empty
public boolean isEmpty() {
    return front == null;
}


‏// Remove task from the front of the queue
public void dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is underflow. No tasks to dequeue.");
        return;
    }
    
    System.out.println("Task Dequeued: " + front);
    front = front.next;
    
    if (front == null) {
        rear = null;
    }
    size--;
}
  
  
