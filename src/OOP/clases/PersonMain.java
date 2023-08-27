package OOP.clases;

public class PersonMain {
    public static void main(String[] args) {

        Person andreiCuAMic = new Person();

        andreiCuAMic.setheight(191);
        andreiCuAMic.setPushupsCapacity(27);
        andreiCuAMic.setDoesHeSellGolf4(true);
        andreiCuAMic.setKmRunedInAugust(71);
        andreiCuAMic.printAllParameters();

        Person person2 = new Person();

        person2.setDoesHeSellGolf4(false);
        person2.setPushupsCapacity(9999);
        person2.setheight(168);
        person2.setKmRunedInAugust(0);
        person2.printAllParameters();

        Person theOne = new Person(true, 38, 195.6f, 47);
        theOne.printAllParameters();

    }
}

