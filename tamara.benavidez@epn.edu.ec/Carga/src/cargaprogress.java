public class cargaprogress {
    public static void main(String[] args) 
    {
        App bar = new App();

        System.out.println("Process Starts Now!");

        bar.update(0, 1000);
        for(int i=0;i<1000;i++) {
                        // do something!
            for(int j=0;j<10000;j++)
                for(int p=0;p<1000;p++);
            // update the progress bar
            bar.update(i, 1000);
        }
        System.out.println("Process Completed!");
    }
    
}
