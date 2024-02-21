import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CoefficientsBean implements Serializable {

    private double a;
    private double b;
    private double c;
    String result;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
public String generateRandomParameters() {
        Random random = new Random();
       
        a = random.nextDouble() * 10; // losowa liczba od 0 do 10
        b = random.nextDouble() * 10;
        c = random.nextDouble() * 10;

    
        return "coefficientsInput";
}
    public String calculateResult() {
   
    double delta = b * b - 4 * a * c;

    if (delta > 0) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        result = "x1 = " + x1 + ", x2 = " + x2;
    } else if (delta == 0) {
        double x = -b / (2 * a);
        result = "x = " + x;
    } else {
       
        result = "Brak pierwiastków rzeczywistych";
    }
   

    return "result"; 
}
}
