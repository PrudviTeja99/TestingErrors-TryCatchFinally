
class Hello{
    int testing(){

        try{
            System.out.println("In Try");
            int a=5/0;
            return 11;
        }
        catch (Exception e){
            System.out.println("In catch");
            return 22;
        }
        finally {
            System.out.println("In finally");
            return 33;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hello h=new Hello();
        System.out.println(h.testing());
    }
}
