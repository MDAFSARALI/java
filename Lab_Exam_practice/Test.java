 class fibonacci extends Thread {
    int n = 100;
    int a = 0;
    int b = 1;

    public void run() {
        for (int i = 1; i <= n; i++) {
            int nextans = a + b;
            System.out.println("fibonacci nos: "+nextans);
            b = nextans;
            a = b;
            i++;
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
class prime extends Thread {
    int n = 100;

    public void run() {
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    j++;
                    continue;
                }
                System.out.println("Prime nos:+"+j);
            }
            i++;

        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception in prime");
        }
    }

    }

 public  class Test{
    public static void main(String[] args) {
        new fibonacci().start();
        new prime().start();
    }
  }  
   
