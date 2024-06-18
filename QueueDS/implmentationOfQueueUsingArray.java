public class implmentationOfQueueUsingArray {
  static class Queue{
    int[] arr;
    int size;
    int rear;

    Queue(int n){
      arr = new int[n];
      size = n;
      rear = -1;
    }

    public boolean isEmpty(){
      return rear == -1;
    }

    //add element from queue
    public void add(int data){
      if(rear == size-1){
        System.out.println("Overflow");
        return;
      }

      rear = rear + 1;
      arr[rear] = data;
    }

    //remove element from queue
    public int remove(){
      if(isEmpty()){
        System.out.println("Underflow");
        return -1;
      }

      int front = arr[0];
      for(int i=0; i<rear; i++){
        arr[i] = arr[i+1];
      }
      rear = rear - 1;

      return front;
    }

    //peek
    public int peek(){
      if(isEmpty()){
        System.out.println("Underflow");
        return -1;
      }

      return arr[0];
    }
  }
  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    while(!q.isEmpty()){
      System.out.println(q.peek());
      q.remove();
    }
  }
}
