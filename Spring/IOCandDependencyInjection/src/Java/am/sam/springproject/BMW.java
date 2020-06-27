package am.sam.springproject;

public class BMW implements Car {

    private String name;
    private String series;

    public BMW(String series) {
        this.name = "BMW";
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
