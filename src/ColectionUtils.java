import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ColectionUtils {
    public static <T,R> List<R> generate(Supplier<T> supplier,int num){
        List<R> result = new ArrayList<>();
        for (int i= 0; i<num; i++){
            result.add((R) supplier.get());
        }
        return result;
    }

    public static List<Double> cuadrado (List<Double> list){
        List<Double> result2 = new ArrayList<>();
        for (Double num: list) {
            result2.add(num*num);
        }
        return result2;
    }

    public static List<Double> filtrarNum (List<Double> list){
        List<Double> result3 = new ArrayList<>();
        for (Double num: list) {
            if (num>10){
                result3.add(num);
            }else{
                System.out.println("//");
            }
        }
        return null;
    }

    public static Double sumList (List<Double> list){
        Double sumatori = 0.0;
        for (Double num: list) {
            sumatori= sumatori+num;
        }
        return sumatori;
    }


}
