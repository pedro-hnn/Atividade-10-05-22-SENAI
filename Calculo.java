import com.sun.istack.internal.Nullable;

public class Calculo {
    private Double num1;
    private Double num2;
    private Double num3 = 0.0;
    private Double num4 = 0.0;

    public Calculo(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculo(Double num1, Double num2, Double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Calculo(Double num1, Double num2, Double num3, Double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public Double Soma(){
        return this.num1+this.num2+this.num3+this.num4;
    }
}
