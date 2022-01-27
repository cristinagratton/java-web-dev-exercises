package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer helios = new Computer(500, 16, "GoForce RTX 3070");
        System.out.println(helios.getId());
        System.out.println("The current storage is " + helios.getStorage());
        System.out.println("The current ram is " + helios.getRam());
        helios.increaseStorage(250);
        helios.increaseRam(16);
        System.out.println("The current storage is " + helios.getStorage());
        System.out.println("The current ram is " + helios.getRam());

        Laptop heliosLaptop = new Laptop(500, 32, "RTX 3060 TI", 20);

        System.out.println(heliosLaptop.isClunky());
        System.out.println(heliosLaptop.getWeight());
        System.out.println(heliosLaptop.getGraphicsCard());
        System.out.println(heliosLaptop.getId());

        SmartPhone samsung = new SmartPhone(500, 16, "n/a", 32, 521);
        System.out.println(samsung.getNumOfPhotos());
        System.out.println(samsung.getNumOfApps());
        samsung.takePhoto();
        samsung.downloadApp();
        System.out.println(samsung.getNumOfPhotos());
        System.out.println(samsung.getNumOfApps());
        System.out.println(samsung.getStorage());
        System.out.println(samsung.getId());
    }
}
