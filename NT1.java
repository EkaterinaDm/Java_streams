package pr3;

class NT1 implements Runnable{
    String nаmе; // имя потока исполнения
    int n;
    Computer obj[];
    Thread t;
    NT1(String threadname, int n, Computer obj[]){
        this.n = n;
        this.obj = obj;
        nаmе = threadname;
        t = new Thread(this, nаmе);
        System.out.println("Hoвый поток: " + t);
        t.start();// запустить поток исполнения
    }
    public void run() {  // точка входа в поток исполнения
        try {
            int min = 0; //поиск наименьшей стоимости компьютера
            for (int i=0; i<n; i++){
                if ((int)obj[i].getcost()<(int)obj[min].getcost())
                {
                    min = i;
                }
            }
            System.out.print((min+1) + " " + obj[min].getname() + " - "); 
            obj[min].showCost(); 
            Thread.sleep(1000);
        }
        catch(InterruptedException е) {
            System.out.println (nаmе + " прерван.");
        }
    System.out.println (nаmе + " завершен.");
    }
}
