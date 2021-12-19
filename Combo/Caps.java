package Practice;

public abstract class Caps {
   abstract void Data();
   private int a;
}
class Run extends Caps {
    void Data(){
        System.out.println("Welcome To Abstract Method ");
    }
    void setinput(int a){
        int A=a;
    }
    int getinput(int a){
        return a;
    }
    public static void main(String args[]){
        Run obj = new Run();
        obj.Data();
        obj.setinput(10);
        System.out.println(obj.getinput(20));
    }
}
