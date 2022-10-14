package com.bootcoding.oops;

public class Books {
    String title;

    public int add(int a, int b){
        return  a + b;
    }
    public String getTitle() {
        return title;
    }

    public String getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    String pages;
    String description;
    String quantity;
    double price;
    String publisher;


}
