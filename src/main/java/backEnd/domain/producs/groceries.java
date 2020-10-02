package backEnd.domain.producs;

public class groceries extends  product {
    private Double costPerWeight;
    private Double weight;
    public groceries (String productNumber, String productName, Double cost, Double price,Double costPerWeight,Double weight) {
        super(productNumber,productName,cost,price);
        this.costPerWeight = costPerWeight;
        this.weight=weight;
    }

    public Double getCostPerWeight(){
        return this.costPerWeight;
    }
    public void setCostPerWeight(Double costPerWeight){
        this.costPerWeight=costPerWeight;

    }

    public Double getWeight(){
        return  this.weight;
    }

    public void setWeight(Double weight){
        this.weight =weight;
    }

     @Override
    public Double getCost(){
        return this.costPerWeight * weight;
     }
     @Override
     public Double getPrice(){
        return super.getPrice() * weight;
     }

}

