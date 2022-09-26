// enqueue():- that takes the queue
// and the integer to be added as a parameter.
public static void enqueue(Queue<Integer> qu, int x)
    {
        // enter your code here
        qu.add(x);
    }

// dequeue():- that takes the queue as parameter.
 public static void dequeue(Queue<Integer> qu)
    {
        //enter your code here
        qu.poll();
    }

// displayfront():-  that takes the queue as parameter.
    public static void displayfront(Queue<Integer> qu)
    {
        // enter your code here
        if(qu.isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(qu.peek());
        }
    }
