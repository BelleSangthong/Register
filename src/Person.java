public class Person
{
    private String name;

    //konstruktor
    //Skapa en ny person använder man konstruktor
    public Person(String name)
    {
        this.name = name;
    }

    //Getter
    public String getName()
    {
        return this.name;
    }

    //Setter
    //Ändra en person
    public void setName(String name)
    {
        this.name = name;
    }

    @Override       //Återanvända en metod som redan finns
    public String toString()
    {
        return "Person{name=\'" + this.name + "'}";
    }

}
