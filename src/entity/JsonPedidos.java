/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author llucero
 */
public class JsonPedidos {

    private String planta;

    private String almacen;

    private String almacensap;

    private String contrato;

    private Pedido pedido;

    public JsonPedidos() {
        this.planta = "";
        this.almacen = "";
        this.almacensap = "";
        this.contrato = "";
        this.pedido = new Pedido();
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getAlmacensap() {
        return almacensap;
    }

    public void setAlmacensap(String almacensap) {
        this.almacensap = almacensap;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
