package set08103_cwk.Classes;

public class CapitalCity {

    private String name;

    private String country;

    private int population;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return name + ", "  + country + ", "  + population + "\n" ;
    }
}
