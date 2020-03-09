package set08103_cwk.Classes;

public class Population {

    private String name;
    private int population;
    private int cityPopulation;
    private double cityPopulationPercent;
    private int notCityPopulation;
    private double cityPopulationPercentPercent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public double getCityPopulationPercent() {
        return cityPopulationPercent;
    }

    public void setCityPopulationPercent(double cityPopulationPercent) {
        this.cityPopulationPercent = cityPopulationPercent;
    }

    public int getNotCityPopulation() {
        return notCityPopulation;
    }

    public void setNotCityPopulation(int notCityPopulation) {
        this.notCityPopulation = notCityPopulation;
    }

    public double getCityPopulationPercentPercent() {
        return cityPopulationPercentPercent;
    }

    public void setCityPopulationPercentPercent(double cityPopulationPercentPercent) {
        this.cityPopulationPercentPercent = cityPopulationPercentPercent;
    }


    @Override
    public String toString() {
        return name + " " + population + " " + cityPopulation + " " + cityPopulationPercent + " " + notCityPopulation + " " + cityPopulationPercentPercent + "\n";
    }
}
