package t;


public class Writer extends Thread {
    private StringQueue queue;

    public Writer(StringQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            String input = queue.get();
            if (input == null)
                System.out.println("empty");
            else
                System.out.println(input);
            try {
                Thread.sleep(5000);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
