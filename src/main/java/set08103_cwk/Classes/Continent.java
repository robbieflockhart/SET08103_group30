//Country class

package set08103_cwk.Classes;

public class Continent {

    private String countryName;

    private int countryPopulation;

    private String countryContinent;

    private int cityID;

    private int cityPopulation;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public String getCountryContinent() {
        return countryContinent;
    }

    public void setCountryContinent(String countryContinent) {
        this.countryContinent = countryContinent;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
        return "Country name: '" + countryName + "', total country pop: '" + countryPopulation + "', continent name: '" + countryContinent + "', city id: '" + cityID + "', city pop: '" + cityPopulation +"'\n";
    }
}
