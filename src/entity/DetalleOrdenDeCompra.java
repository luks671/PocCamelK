/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author llucero
 */
public class DetalleOrdenDeCompra {

    private String gs1_numero_de_linea_de_cliente;

    private String gs1_orden_de_compra;

    private String gs1_fecha_orden_de_compra;

    private String gs1_numero_linea;

    private String gs1_tipo_material;

    private String gs1_cantidad_pedida;

    public DetalleOrdenDeCompra() {
        this.gs1_numero_de_linea_de_cliente = "";
        this.gs1_orden_de_compra = "";
        this.gs1_fecha_orden_de_compra = "";
        this.gs1_numero_linea = "";
        this.gs1_tipo_material = "";
        this.gs1_cantidad_pedida = "";
    }

    public String getGs1_numero_de_linea_de_cliente() {
        return gs1_numero_de_linea_de_cliente;
    }

    public void setGs1_numero_de_linea_de_cliente(String gs1_numero_de_linea_de_cliente) {
        this.gs1_numero_de_linea_de_cliente = gs1_numero_de_linea_de_cliente;
    }

    public String getGs1_orden_de_compra() {
        return gs1_orden_de_compra;
    }

    public void setGs1_orden_de_compra(String gs1_orden_de_compra) {
        this.gs1_orden_de_compra = gs1_orden_de_compra;
    }

    public String getGs1_fecha_orden_de_compra() {
        return gs1_fecha_orden_de_compra;
    }

    public void setGs1_fecha_orden_de_compra(String gs1_fecha_orden_de_compra) {
        this.gs1_fecha_orden_de_compra = gs1_fecha_orden_de_compra;
    }

    public String getGs1_numero_linea() {
        return gs1_numero_linea;
    }

    public void setGs1_numero_linea(String gs1_numero_linea) {
        this.gs1_numero_linea = gs1_numero_linea;
    }

    public String getGs1_tipo_material() {
        return gs1_tipo_material;
    }

    public void setGs1_tipo_material(String gs1_tipo_material) {
        this.gs1_tipo_material = gs1_tipo_material;
    }

    public String getGs1_cantidad_pedida() {
        return gs1_cantidad_pedida;
    }

    public void setGs1_cantidad_pedida(String gs1_cantidad_pedida) {
        this.gs1_cantidad_pedida = gs1_cantidad_pedida;
    }
}
