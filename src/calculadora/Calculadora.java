package calculadora;

public class Calculadora {
    double a;
    double h;

    public Calculadora(){
        a=1;
        h=1;
    }
    
    public double suma(double x, double y){
        a=x;
        h=y;
        
        return a+h;
    }


    public static void main(String[] args) {
        
    } 
}
