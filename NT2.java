package pr3;

class NT2 implements Runnable{
    String nаmе; // имя потока исполнения
    int n;
    Computer obj[];
    String k;
    Thread g ;
    NT2(String threadname, int n, Computer obj[], String k){
        nаmе = threadname;
        this.n = n;
        this.obj = obj;
        this.k = k;
        g = new Thread(this, nаmе);
        System.out.println("Hoвый поток: " + g);
        g.start();  // запустить поток исполнения
    }
    public void run() {  // точка входа в поток исполнения
        try {
            int s = 0;
            int a = 0;
            for (int i=0; i<n; i++){
                if (obj[i].getname().equals(k))
                {
                    a = i;
                    s++;
                }
            }
            obj[a].showTypes();
            System.out.println(s);
            Thread.sleep(1000);
        }
        catch(InterruptedException е) {
            System.out.println (nаmе + " прерван.");
        }
        System.out.println (nаmе + " завершен.");
    }
}

