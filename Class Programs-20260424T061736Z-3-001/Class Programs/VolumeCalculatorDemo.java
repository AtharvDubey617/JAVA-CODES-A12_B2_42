class VolumeCalculator {
    double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    double calculateVolume(int length, int breadth, int height) {
        return length*breadth*height;
    }
}

public class VolumeCalculatorDemo {
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();
        double cylinderVolume = vc.calculateVolume(10, 5);
        System.out.println("Volume of Cylinder: " + cylinderVolume);
        double cuboidVolume = vc.calculateVolume(10, 20, 30);
        System.out.println("Volume of Cuboid: " + cuboidVolume);        
    }
}