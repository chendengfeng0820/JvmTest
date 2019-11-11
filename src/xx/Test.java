package xx;

public class Test {
    private static int x=0;
    public static void main(String[] args) {
        try {
            a();
        }catch (Throwable e){
            System.out.println("deep of calling:"+x);
            e.printStackTrace();
        }
    }
    public static void a(){
            x++;
            a();

        }
    }
