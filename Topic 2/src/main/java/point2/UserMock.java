package point2;

/**
 * Created by martin on 30/6/2018.
 */
public class UserMock {

    public void print(){
        System.out.print(getName());
    }

    public void print2(){
        System.out.print("Martin");
    }

    public String getName(){
        return "Martin";
    }

}
