package br.com.davi.screenmatch.models;

public abstract class Obra {
    private String title;
    private Integer year;
    private boolean noPlano;
    private double stars;
    private double sumRatings;
    private int totalRatings;

    public void avalia(double nota){
        this.sumRatings += nota;
        this.totalRatings++;
    }
    protected void avaliacao(){
        this.stars = getSumRatings() / getTotalRatings() / 2;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public boolean isNoPlano() {
        return noPlano;
    }

    public void setNoPlano(boolean noPlano) {
        this.noPlano = noPlano;
    }

    public double getStars() {
        return stars;
    }

    public double getSumRatings() {
        return sumRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }
}
