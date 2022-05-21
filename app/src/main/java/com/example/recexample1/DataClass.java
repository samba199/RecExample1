package com.example.recexample1;

public class DataClass {
    private int imageview1;
    private String textview1;
    private String textview2;
    private int imageview2;
    private int imageview3;
    DataClass(int imageview1,String textview1,String textview2,int imageview2,int imageview3){
        this.imageview1=imageview1;
        this.textview1=textview1;
        this.textview2=textview2;
        this.imageview2=imageview2;
        this.imageview3=imageview3;
    }

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public int getImageview2() {
        return imageview2;
    }

    public int getImageview3() {
        return imageview3;
    }
}
