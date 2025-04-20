public class Hero
{

    //Stores the name, powerlevel, affiliation, superpower, and origincity for the superhero
    private String name;
    private int powerLevel;
    private Affiliation affiliation;
    private String superpower;
    private String originCity;

    //This is the constructor that initializes the superheroes attributes
    public Hero(String name, int powerLevel, Affiliation affiliation, String superpower, String originCity)
    {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
        this.superpower = superpower;
        this.originCity = originCity;
    }
    //getter for the name
    public String getName()
    {
        return name;
    }
    //getter for the powerlevel
    public int getPowerLevel()
    {
        return powerLevel;
    }
    //getter for the affiliation
    public Affiliation getAffiliation()
    {
        return affiliation;
    }
    //getter for the superpower
    public String getSuperpower()
    {
        return superpower;
    }
    //getter for the origincity
    public String getOriginCity()
    {
        return originCity;
    }
    //returns string with the heroes details
    public String toString()
    {
        return "Name: " + name + ", Power Level: " + powerLevel + ", Affiliation: " + affiliation + ", Superpower: " + superpower + ", Origin City: " + originCity;
    }





}