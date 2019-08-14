package chapter03.ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DessertShop {
    private Dessert dessert;

    public Dessert getDessert() {
        return dessert;
    }

    @Autowired
    @Cold
    @Creamy
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void showDessertName() {
        this.dessert.showName();
    }
}
