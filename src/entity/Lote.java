package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author llucero
 */
public class Lote {

    private String codigo;

    private String lote_de_fabricante;

    private String fecha_de_vencimiento;

    private OtrosDatos otrosdatos;

    public Lote() {
        this.codigo = "";
        this.lote_de_fabricante = "";
        this.fecha_de_vencimiento = "";
        this.otrosdatos = new OtrosDatos();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLote_de_fabricante() {
        return lote_de_fabricante;
    }

    public void setLote_de_fabricante(String lote_de_fabricante) {
        this.lote_de_fabricante = lote_de_fabricante;
    }

    public String getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(String fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public OtrosDatos getOtrosdatos() {
        return otrosdatos;
    }

    public void setOtrosdatos(OtrosDatos otrosdatos) {
        this.otrosdatos = otrosdatos;
    }
}
