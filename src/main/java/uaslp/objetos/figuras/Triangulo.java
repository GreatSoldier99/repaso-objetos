package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base;
    private double altura;

    public Triangulo(){
    }

    public Triangulo(double base, double altura){
        this.altura=altura;
        this.base=base;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    public double getAltura(){
        return altura;
    }

    public void setBase(double base){
        this.base=base;
    }

    public double getBase(){
        return base;
    }

    public double getArea(){
        double area = (base*altura)/2;
        return area;
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }

    public String getName(){
        return "Triangulo";
    }
}
