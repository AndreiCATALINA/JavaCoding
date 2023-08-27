package OOP.clases;

public class MainTema {
    public static void main(String[] args) {
        Tema camera1 = new Tema();
        camera1.marimeSuprafata = 5;
        camera1.obiect1 = "mileu";
        camera1.obiect2 = "dus";
        camera1.obiect3 = "covor";
        camera1.printAllParameters();

        Tema camera2 = new Tema();
        camera2.marimeSuprafata = 4;
        camera2.obiect1 = "pat";
        camera2.obiect2 = "noptiera";
        camera2.obiect3 = "balcon";
        camera2.printAllParameters();

        Tema camera3 = new Tema(2, "oglinda", "toaleta","cada");
        camera3.printAllParameters();
    }
}
