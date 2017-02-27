package generics;

/**
 * Created by Дмитр ий on 27.02.2017.
 */
public class First {
    public void print(){
        throw new IllegalArgumentException();
    }
    public static void main(String[] args) {
        First first = new First();
        try{
            first.print();
        }catch (RuntimeException e){
            System.out.println("First catch");
        }catch (Error e){
            System.out.println("Second catch");
        }catch (Exception e){
            System.out.println("Third catch");
        }
    }


}


