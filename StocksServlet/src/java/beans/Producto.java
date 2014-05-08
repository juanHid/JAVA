/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author juan
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int stock;
    private double precioCompra;
    private static int stockMinimo=10;
    
    public Producto(String codigo,String nombre,int stock,double precioCompra){
        this.codigo=codigo;
        this.nombre=nombre;
        this.stock=stock;
        this.precioCompra=precioCompra;
 
    }
    public Producto(){
        
    }

    @Override
    public String toString(){
        String salida="Codigo :"+codigo+"<br/>"+
                      "Nombre :"+nombre+"<br/>"+
                      "Stock  :"+stock+" ud.<br/>"+
                      "Precio :"+precioCompra+" €<br/><hr>";
        
        
        return salida;   
    }
    
    public double getTotal(){
        double salida=0;
        salida=stock*precioCompra;
        return salida;
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public static int getStockMinimo() {
        return stockMinimo;
    }

    public static void setStockMinimo(int stockMinimo) {
        Producto.stockMinimo = stockMinimo;
    }
    
    
}
