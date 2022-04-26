/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author llucero
 */
public class Destinatario {

    private String modo_de_transporte;

    private String id_destinatario;

    private String id_internocliente;

    private String nombre_completo;

    private String email;

    private String telefonos;

    private String tipo_de_documento;

    private String contacto;

    public Destinatario() {
        this.modo_de_transporte = "";
        this.id_destinatario = "";
        this.id_internocliente = "";
        this.nombre_completo = "";
        this.email = "";
        this.telefonos = null;
        this.tipo_de_documento = "";
        this.contacto = "";
    }

    public String getModo_de_transporte() {
        return modo_de_transporte;
    }

    public void setModo_de_transporte(String modo_de_transporte) {
        this.modo_de_transporte = modo_de_transporte;
    }

    public String getId_destinatario() {
        return id_destinatario;
    }

    public void setId_destinatario(String id_destinatario) {
        this.id_destinatario = id_destinatario;
    }

    public String getId_internocliente() {
        return id_internocliente;
    }

    public void setId_internocliente(String id_internocliente) {
        this.id_internocliente = id_internocliente;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getTipo_de_documento() {
        return tipo_de_documento;
    }

    public void setTipo_de_documento(String tipo_de_documento) {
        this.tipo_de_documento = tipo_de_documento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
