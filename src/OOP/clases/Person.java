package OOP.clases;
public class Person {
    private int kmRunedInAugust;
    private float heigth;
    private boolean doesHeSellGolf4;
    private int pushupsCapacity;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setPushupsCapacity(int pushupsCapacity) {

        this.pushupsCapacity = pushupsCapacity;
    }

    public void setKmRunedInAugust(int kmRunedInAugust) {

        this.kmRunedInAugust = kmRunedInAugust;
    }

    public void setHeigth(float heigth) {

        this.heigth = heigth;
    }

    public void setDoesHeSellGolf4(boolean doesHeSellGolf4) {

        this.doesHeSellGolf4 = doesHeSellGolf4;
    }

    public Person(boolean doesHeSellGolf4, int kmRunedInAugust, float heigth, int pushupsCapacity) {
        this.doesHeSellGolf4 = doesHeSellGolf4;
        this.kmRunedInAugust = kmRunedInAugust;
        this.heigth = heigth;
        this.pushupsCapacity = pushupsCapacity;
    }
    public Person(){

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getkmRunedInAugust() {
        return kmRunedInAugust;
    }

    public float getheigth() {

        return heigth;
    }

    public int getpushupsCapacity() {
        return pushupsCapacity;
    }

    public boolean getdoesHeSellGolf4() {
        return doesHeSellGolf4;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void printAllParameters() {
        System.out.println(String.format("Vinde cineva Golf 4? %s. Luna August am alergat %s km.Am %s cm si pot face %s flotari \n", doesHeSellGolf4, kmRunedInAugust, heigth, pushupsCapacity));
    }

    public void setheight(int i) {
    }
}