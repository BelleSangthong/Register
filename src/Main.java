import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Dagens lektion: Träna på klasser och objekt
        //Tema: Person generater


        //Arraylist för att samla alla personer (Person)
        ArrayList<Person> allPersons = new ArrayList<>();

        //Generera ett visst antal personer och spara i personlistan
        allPersons.add(new Person("Belle"));
        allPersons.add(new Person("Jimmi"));
        allPersons.add(new Person("Alice"));

        //Skriva ut alla personer
        for (Person p : allPersons)
        {
            System.out.println(p);
        }
    }
}
