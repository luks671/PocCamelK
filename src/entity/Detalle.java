/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author llucero
 */
public class Detalle {
    private String numero_pedido;    
    
    private String unidad_medida;
    
    private String linea_externa;
    
    private Integer unidades;
    
    private String datos_adicionales;

    private Articulo articulo;

    public Detalle() {
        this.numero_pedido = "";
        this.unidad_medida = "";
        this.linea_externa = "";
        this.unidades = null;
        this.datos_adicionales = null;
        this.articulo = new Articulo();
    }

    public String getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(String numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public String getLinea_externa() {
        return linea_externa;
    }

    public void setLinea_externa(String linea_externa) {
        this.linea_externa = linea_externa;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public String getDatos_adicionales() {
        return datos_adicionales;
    }

    public void setDatos_adicionales(String datos_adicionales) {
        this.datos_adicionales = datos_adicionales;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
