package Super;
class SuperSolutionExample {
    int num = 100;
}

public class Super extends SuperSolutionExample {
    int num = 110;
    public static void main(String[] args) {
        Super obj = new Super();
        System.out.println(obj.num);
    }
}
