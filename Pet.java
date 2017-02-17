/**
 * The Pet class - a start of the Pet Inheritance Hierarchy
 */
public class Pet implements Moveable
{
    //fields
    private String name;
    //constructors
    public Pet()
    {
        name = "default pet";
    }   
    public Pet(String n)
    {
        name = n;
    }
    //methods    
    public String getName()
    {
        return name;
    }    
    public String speak()
    {
        return "default pet sound";
    }
    public String move()
    {
        return "Run on 4s";
    }
}


