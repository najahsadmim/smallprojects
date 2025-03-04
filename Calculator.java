
import java.util.Scanner;

public class Calculator {

    public double num1;
    public double num2;
    public double result;
    public String history[] = new String[10];
    public int count = 0;

    public double sum(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 + num2;
        storeHistory(num1 + "+" + num2 + "=" + result);
        return result;
    }

    public double sum(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        result = sum(num1, num2) + num3;
        storeHistory(num1 + "+" + num2 + "+" + num3 + "=" + result);
        return result;
    }

    public double sum(double num1, double num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        result = sum(num1, num2, num3) + num4;
        storeHistory(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + result);
        return result;
    }

    public double sum(double num1, double num2, double num3, double num4, double num5) {
        this.num1 = num1;
        this.num2 = num2;
        result = sum(num1, num2, num3, num4) + num5;
        storeHistory(num1 + "+" + num2 + "+" + num3 + "+" + num4 + "+" + num5 + "=" + result);
        return result;
    }

    public double minus(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 - num2;
        storeHistory(num1 + "-" + num2 + "=" + result);
        return result;
    }

    public double minus(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        result = minus(num1, num2) - num3;
        storeHistory(num1 + "-" + num2 + "-" + num3 + "=" + result);
        return result;
    }

    public double multi(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = num1 * num2;
        storeHistory(num1 + "x" + num2 + "=" + result);
        return result;
    }

    public double multi(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        result = multi(num1, num2) * num3;
        storeHistory(num1 + "x" + num2 + "x" + num3 + "=" + result);
        return result;
    }

    public double divide(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("MATH ERROR!!!");
        }
        storeHistory(num1 + "/" + num2 + "=" + result);
        count++;
        return result;
    }

    public void showHistory() {
        for (int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
        }
    }

    private void storeHistory(String equation) {
        if (count < history.length) {
            history[count] = equation;
            count++;
        } else {
            history[count % history.length] = equation;  //circular array: overwrites old data
            count++;
        }
    }

    public void onCal() {
        char alpha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press S to turn on the calculator: ");
        alpha = sc.next().charAt(0);
        if (alpha == 'S' || alpha == 's') {
            System.out.println("ON");
        }
    }

    public void offCal() {
        char alpha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press X to turn off the calculator: ");
        alpha = sc.next().charAt(0);
        if (alpha == 'X' || alpha == 'x') {
            System.out.println("OFF");
        }
    }
}
