package supermercado;


public interface CalcularDesc {
    double iva = 1.19;
    double carne = 0.8;
    double bebestible = 0.88;
    void calcularIva(double iva, float precio);
    void descCarne(double carne, float precio);
    void descBebestible(double bebestible, float precio);
    void precioFinal();
    void totalProductos();
}
