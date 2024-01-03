package implementations;

import interfaces.DigitalProduct;

public class EBook implements DigitalProduct {
    private String name;
    private double price;
    private String downloadLink;

    public EBook(String name, double price, String downloadLink) {
        this.name = name;
        this.price = price;
        this.downloadLink = downloadLink;
    }

    @Override
    public String getDownloadLink() {
        return downloadLink;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
