package com.dicoding.sarjanasantuy.fragment;

public class Hero {
    private String heroName;
    private String heroDetail;
    private int heroImage;

    public String getHeroName(){
        return heroName;
    }

    public String getHeroDetail() {
        return heroDetail;
    }

    public void setHeroDetail(String heroDetail) {
        this.heroDetail = heroDetail;
    }

    public int getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(int heroImage) {
        this.heroImage = heroImage;
    }

    public void setHeroName(String heroName){
        this.heroName = heroName;
    }
}
