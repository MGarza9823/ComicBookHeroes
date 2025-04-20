import java.util.ArrayList;
public class Main

{
    //Main class used to run the hero managment system
    public static void main(String[] args)
    {
        HeroManager manager = new HeroManager();

    //Adds heroes to the manager
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS, "Wall-Crawling", "New York"));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN, "Metal Claws", "Alberta"));
        manager.addHero(new Hero("SuperMan", 100, Affiliation.JUSTICE_LEAGUE, "Heat Vision", "Krypton"));
        manager.addHero(new Hero("Invisible Woman", 80, Affiliation.FANTASTIC_FOUR, "Invisibility", "Long Island"));

        //this displays the original list of heroes
        System.out.println("Original Hero List: ");
        manager.displayHeroes();


        Hero hero = manager.searchByName("Spider-Man");
        if (hero != null)
        {
            System.out.println("\nFound hero by name: " + hero );
        }
            else 
            {
                System.out.println("\nHero not found by name.");
            }
        //this searches for all of the heroes affiliated with the Avengers
        ArrayList<Hero> avengers = manager.searchByAffiliation(Affiliation.AVENGERS);
        System.out.println("\nHeroes in the Avengers Affiliation:");
        for (Hero avenger : avengers)
        {
            System.out.println(avenger);
        }
        //this sorts and displays the powerlevel using bubble sort
        System.out.println("\nHeroes Sorted by Power Level (Bubble Sort): ");
        manager.bubbleSortByPower();
        manager.displayHeroes();
        //this sorts and displays the powerlevel using insertion
        System.out.println("\nHeroes Sorted By Power Level (Insertion Sort): ");
        manager.insertionSortByPower();
        manager.displayHeroes();
        //removes the hero by name
        System.out.println("\nRemoving 'SuperMan'...");
        manager.removeHero("SuperMan");
        //adds a new hero to the hero list
        System.out.println("\nAdding 'Wonder Woman'...");
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE, "Super Strength", "Themyscira"));

        //this displays the updated hero list
        System.out.println("\nUpdated Hero List: ");
        manager.displayHeroes();

        //this displays the hero list in a 2D Array format
        System.out.println("\nHero List in 2D Array Format: ");
        manager.displayAs2DArray();


    }


}