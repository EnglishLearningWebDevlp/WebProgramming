package test;

/**
 * Created by 2089769600 on 2017/7/16.
 */
public class TestService {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void hello()
    {
        System.out.println("hello "+ getName());
    }
}
