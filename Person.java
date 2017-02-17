public class Person implements Moveable
{
    //fields
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight; 
    private int IQ;
    private String birthDate;
    private boolean isFemale;
    //constructors
        //default
    public Person()
    {
        this.firstName = "Sam";
        this.lastName = "Java";
        this.age = 21;
        this.height  = 66.0;
        this.weight = 175.0;
        this.IQ = 100; 
        this.birthDate = "07-31-2000";
        if (Math.random() > 0.5) {
            this.isFemale = false;
        }
        else {
            this.isFemale = true;
        }
    }
        //via input parameters
    public Person(String firstName, String lastName, int age, double height, double weight, int IQ, String birthDate, boolean isFemale)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.IQ = IQ;
        this.birthDate = birthDate;
        this.isFemale = isFemale;
    }
    //methods
    public String move()
    {
        return "Sprint w/ 2 Legs";
    }
        //accessors
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public int getAge()
    {
        return this.age;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public int getIQ()
    {
        return this.IQ;
    }
    public String getBirthDate()
    {
        return this.birthDate;
    }
    public boolean isFemale()
    {
        return this.isFemale;
    }
        //mutators
    public void happyBDay()
    {
        this.age++;
    }
    public void growthSpurt(double howMuch)
    {
        this.height += howMuch;
    }
        //print
    public void printPersonalReport()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("IQ: " + IQ);
        System.out.println("Birthdate: " + birthDate);
        if (isFemale){
            System.out.println("This person is female.");
        }
        else {
            System.out.println("This person is male.");
        }
    }
        //challenge
    public void createChild(Person partner, String childFirstName, String childBirthDate)
    {
        if (this.isFemale){
            if (partner.isFemale){
                System.out.println("Not Compatible Mates");
            }
            else {
                Person child = new Person(childFirstName, this.lastName, 0, 20.0, 7.5, partner.IQ, childBirthDate, isFemale); //how do you get a random boolean for gender?
            }
        }
        else {
            if (partner.isFemale){
                Person child = new Person(childFirstName, this.lastName, 0, 20.0, 7.5, partner.IQ, childBirthDate, isFemale); //how do you get a random boolean for gender?
            }
            else {
                System.out.println("Not Compatible Mates");
            }
        }
    }
}
    
