package t;

import java.util.Scanner;

public class Reader extends Thread {
    private StringQueue queue;

    public Reader(StringQueue queue){
        this.queue = queue;
    }

    @Override
    public void run(){
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            try{
                Convertor.convert(input);
                queue.add(input);
            }catch (ArithmeticException ex){
                System.out.println("Invalid input");
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
