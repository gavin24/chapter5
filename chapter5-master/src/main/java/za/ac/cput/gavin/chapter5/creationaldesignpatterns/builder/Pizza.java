package za.ac.cput.gavin.chapter5.creationaldesignpatterns.builder;


public class Pizza {
    private String topping1;
    private String topping2;
    private String topping3;

    public String getTopping1() {
        return topping1;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public String toString() {
        return "topping1: " + topping1 + ", topping2: " + topping2 + ", topping3: " + topping3;
    }
}
