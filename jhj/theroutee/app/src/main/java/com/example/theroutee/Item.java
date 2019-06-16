package com.example.theroutee;

public class Item {
    String name;
    int resId;

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public Item(String name, int resId)
    {
        this.name=name;

        this.resId=resId;

    }    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
