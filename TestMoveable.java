public class TestMoveable
{
    public static void main(String []args)
    {
        Person person1 = new Person();
        person1.move();
        Pet pet1 = new Pet();
        pet1.move();
        Moveable t1 = person1;
        t1.move();
        Moveable t2 = pet1;
        t2.move();
        Moveable[] Move = new Moveable[3];
        Move[0] = new Person();
        Move[1] = new Person();
        Move[2] = new Pet();
        for (int i=0; i<3; i++)
        {
            System.out.println(Move[i].move());
        }
    }
}