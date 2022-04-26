/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author llucero
 */
public class Direccion {

    private String calle;

    private String numero;

    private String codigopostal;

    private String localidad;

    private String provincia;

    private String pais;

    private String piso;

    private String departamento;

    private String referencia_de_domicilio;

    private String componentes_de_direccion;

    public Direccion() {
        this.calle = "";
        this.numero = "";
        this.codigopostal = "";
        this.localidad = "";
        this.provincia = "";
        this.pais = "";
        this.piso = "";
        this.departamento = "";
        this.referencia_de_domicilio = "";
        this.componentes_de_direccion = null;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getReferencia_de_domicilio() {
        return referencia_de_domicilio;
    }

    public void setReferencia_de_domicilio(String referencia_de_domicilio) {
        this.referencia_de_domicilio = referencia_de_domicilio;
    }

    public String getComponentes_de_direccion() {
        return componentes_de_direccion;
    }

    public void setComponentes_de_direccion(String componentes_de_direccion) {
        this.componentes_de_direccion = componentes_de_direccion;
    }

}
