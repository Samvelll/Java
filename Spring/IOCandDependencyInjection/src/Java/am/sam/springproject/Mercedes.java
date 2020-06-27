package am.sam.springproject;

public class Mercedes implements Car {

    private String name;
    private String series;

    public Mercedes(String series) {
        this.name = "Mercedes";
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
