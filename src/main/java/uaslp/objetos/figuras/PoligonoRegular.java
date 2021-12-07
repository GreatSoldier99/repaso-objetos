package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    private int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados){
        if(numeroDeLados<5)
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");

        this.numeroDeLados=numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public void setLado(double lado){
        this.lado=lado;
    }

    public double getLado(){
        return lado;
    }

    public double getArea(){
        double angulo, apotema, perimetro;

        angulo = (double)360/(2*numeroDeLados);
        angulo = Math.toRadians(angulo);
        angulo = Math.tan(angulo);
        apotema = lado/(2*angulo);
        perimetro = lado*numeroDeLados;

        return (perimetro*apotema)/2;
    }

    public String getName(){
        return "Poligono Regular";
    }
}