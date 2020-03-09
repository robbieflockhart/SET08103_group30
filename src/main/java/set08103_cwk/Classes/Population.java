package set08103_cwk.Classes;

public class Population {

    private String name;
    private long population;
    private long cityPopulation;
    private double cityPopulationPercent;
    private long notCityPopulation;
    private double nonCityPopulationPercent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public double getCityPopulationPercent() {
        return cityPopulationPercent;
    }

    public void setCityPopulationPercent(double cityPopulationPercent) {
        this.cityPopulationPercent = cityPopulationPercent;
    }

    public long getNotCityPopulation() {
        return notCityPopulation;
    }

    public void setNotCityPopulation(long notCityPopulation) {
        this.notCityPopulation = notCityPopulation;
    }

    public double getNonCityPopulationPercent() {
        return nonCityPopulationPercent;
    }

    public void setNonCityPopulationPercent(double nonCityPopulationPercent) {
        this.nonCityPopulationPercent = nonCityPopulationPercent;
    }

    @Override
    public String toString() {
        return name + " " + population + " " + cityPopulation + " " + cityPopulationPercent + " " + notCityPopulation + " " + nonCityPopulationPercent  +"\n";
    }

}
