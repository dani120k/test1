package t;

public class App 
{
    public static void main( String[] args )
    {
        StringQueue queue = new StringQueue();
        Reader reader = new Reader(queue);
        reader.start();
        Writer writer = new Writer(queue);
        writer.start();
    }
}
