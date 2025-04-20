import java.util.ArrayList;
import java.util.Arrays;

//public class for hero object
public class HeroManager
{
    private ArrayList<Hero> heroes;

//constructor that initializes hero list
    public HeroManager()
    {
        heroes = new ArrayList<>();
    }
    //this adds a hero to the list
    public void addHero(Hero hero)
    {
        heroes.add(hero);
    }

    //this removes a hero by name from the list. returns true if removed successfully
    public boolean removeHero(String name)
    {
        for (Hero hero : heroes)
        {
            if (hero.getName().equalsIgnoreCase(name))
            {
                heroes.remove(hero);
                return true;
            }
        }
        return false;
    }
//This sorts the power level of the hero in ascending order using bubble sort
public void bubbleSortByPower()
{
    for(int i = 0; i < heroes.size() - 1; i++)
    {
        for(int j = 0; j < heroes.size() - i - 1; j++)
        {
            if(heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel())
            {
                Hero temp = heroes.get(j);
                heroes.set(j, heroes.get(j + 1));
                heroes.set(j + 1, temp);
            }
        }
    }
}
//This sorts the power level of the hero in ascending order using insertion 
public void insertionSortByPower()
{
    for(int i = 1; i < heroes.size(); i++)
    {
        Hero key = heroes.get(i);
        int j = i -1;
        while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel())
        {
            heroes.set(j + 1, heroes.get(j));
            j--;
        }
        heroes.set(j + 1,key);
    }
}
//displays heroes using toString() method
public void displayHeroes()
{
    for (Hero hero : heroes)
    {
        System.out.println(hero);
    }
}
//This displays heroes in a 2D Array and prints it
public void displayAs2DArray()
{
    String[][] heroArray = new String[heroes.size()][5];

    for(int i = 0; i < heroes.size(); i++)
    {
        Hero hero = heroes.get(i);
        heroArray[i][0] = hero.getName();
        heroArray[i][1] = String.valueOf(hero.getPowerLevel());
        heroArray[i][2] = hero.getAffiliation().toString();
        heroArray[i][3] = hero.getSuperpower();
        heroArray[i][4] = hero.getOriginCity();
    }
    System.out.println(Arrays.deepToString(heroArray));
}
//This searches the hero by name
public Hero searchByName(String name)
{
    for(Hero hero : heroes)
    {
        if(hero.getName().equalsIgnoreCase(name))
        {
            return hero;
        }
    }
    return null;
}
//This returns a list of heroes that belong to a certain affiliation
public ArrayList<Hero> searchByAffiliation(Affiliation affiliation)
{
    ArrayList<Hero> result = new ArrayList<>();
    for(Hero hero : heroes)
    {
        if (hero.getAffiliation() == affiliation)
        {
            result.add(hero);
        }
    }
    return result;
}


}