        class NewThread implements Runnable {
        String name ; // имя потока исполнения
        Thread t ;
        NewThread ( String threadпame ) {
        name = threadпame ;
        t = new Thread ( this , name ) ;
        System.out.println( "Hoвый поток : " + t ) ;
        t.start() ; }

        public void run(){try{
                for ( int i=10 ; i > 0; i --) {
                    Log.console(" "+name+" thread working\n");
                    Thread.sleep( 100) ;}}
            catch(InterruptedException e ) {
                System.out.println(name+ " прерван " ) ;}
                System.out.println(name + " завершен." ) ;
        }
}