import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] arg){

        List<Double> num = ColectionUtils.generate(()->Math.random(),10);
        num.stream().forEach(integer -> System.out.println(integer));
        System.out.println("--------------");

        int opt = Integer.parseInt(JOptionPane.showInputDialog("que desea hacer? 1-alevar cuadrado, 2-num>10, 3-suma"));

        switch (opt){
            case 1:
                List<Double> elevate = ColectionUtils.cuadrado(num);
                System.out.println(elevate);
                break;
            case 2:
                List<Double> filter10 = ColectionUtils.filtrarNum(num);
                System.out.println(filter10);
                break;
            case 3:
                Double numSum = ColectionUtils.sumList(num);
                System.out.println(numSum);
                break;
            default:
                break;
        }
    }
}