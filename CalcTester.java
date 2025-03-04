
public class CalcTester {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.onCal();
        System.out.println("==================");
        System.out.println(c1.sum(67, 81.5));
        System.out.println(c1.sum(64, 5.6, 78, 9.9));
        System.out.println(c1.multi(12, 12, 12));
        System.out.println(c1.minus(76, 13.5));
        System.out.println(c1.minus(34, 5, 2));
        System.out.println(c1.divide(0.5, 0.125));
        System.out.println("==================");
        c1.showHistory();  
        System.out.println("==================");
        System.out.println(c1.sum(14.3, 69.5));
        System.out.println(c1.sum(64, 5.6, 78, 9.9, 7));
        System.out.println(c1.multi(11, 12, 13));
        System.out.println(c1.minus(36, 11.55));
        System.out.println(c1.minus(89, 34, 10));
        System.out.println(c1.divide(0.75, 0.0625));
        System.out.println("==================");
        c1.showHistory();
        System.out.println("==================");
        c1.offCal();
    }
}
