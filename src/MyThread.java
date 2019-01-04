public class MyThread extends Thread  {
    String name;
    public void myrun()
    {
        for(int i=0;i<5;i++)
        Log.console(" "+name+" thread working\n");
    }
}
