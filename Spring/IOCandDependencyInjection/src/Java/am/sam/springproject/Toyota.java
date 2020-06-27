package am.sam.springproject;

public class Toyota implements Car {

    private String name;
    private String series;

    public Toyota(String series) {
        this.name = "Toyota";
        this.series = series;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSeries() {
        return series;
    }
}
