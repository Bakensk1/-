package com.company.wagon;

public class FreightWagon extends Wagon{
    public String product;
    public double weightOfProduct;

    public FreightWagon(double weight, double volume,double weightOfProduct,String product) {
        super(weight, volume);
        this.weightOfProduct = weightOfProduct;
        this.product = product;
    }
    @Override
    public String getProduct() {
        return product;
    }
    @Override
    public void setProduct(String product) {
        this.product = product;
    }
    @Override
    public double totalWeight(){
        return weight + weightOfProduct;
    }

}
