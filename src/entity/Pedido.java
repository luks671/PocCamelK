/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author llucero
 */
public class Pedido {

    private String propietario;

    private String cliente_padre;

    private String id_pedido;

    private String numero;

    private String tipo;

    private String prioridad_de_preparacion;

    private String fecha_pedido;

    private String fecha_entrega;

    private String remito;

    private String id_cliente;

    private String referencia_cliente;

    private String codigo_transportista;

    private String acondicionamiento_secundario;

    private String motivo;

    private String ramo_del_destinatario;

    private String id_ejecucion;

    private String embalaje;

    private String notas;

    private String admite_cambio_lote_dirigido;

    private String admite_picking_parcial;

    private Boolean imprime_documentacion;

    private String nro_vale;

    private String valor_declarado;

    private String campos_libres;

    private String socio_comercial;

    private String modo_de_transporte;

    private Destinatario destinatario;

    private Direccion direccion;

    private String datosadicionales;

    private List<Detalle> detalles;

    private DetalleOrdenDeCompra detalleordendecompra;

    public Pedido() {
        this.propietario = "";
        this.cliente_padre = "";
        this.id_pedido = "";
        this.numero = "";
        this.tipo = "";
        this.prioridad_de_preparacion = "";
        this.fecha_pedido = "";
        this.fecha_entrega = "";
        this.remito = "";
        this.id_cliente = "";
        this.referencia_cliente = "";
        this.codigo_transportista = "";
        this.acondicionamiento_secundario = "";
        this.motivo = "";
        this.ramo_del_destinatario = "";
        this.id_ejecucion = "";
        this.embalaje = "";
        this.notas = null;
        this.admite_cambio_lote_dirigido = "";
        this.admite_picking_parcial = "";
        this.imprime_documentacion = false;
        this.nro_vale = "";
        this.valor_declarado = "";
        this.campos_libres = "";
        this.socio_comercial = "";
        this.modo_de_transporte = "";
        this.destinatario = new Destinatario();
        this.direccion = new Direccion();
        this.datosadicionales = null;
        this.detalles = new ArrayList<>();
        this.detalleordendecompra = new DetalleOrdenDeCompra();
    }

    public void setImprime_documentacion(Boolean imprime_documentacion) {
        this.imprime_documentacion = imprime_documentacion;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getDatosadicionales() {
        return datosadicionales;
    }

    public void setDatosadicionales(String datosadicionales) {
        this.datosadicionales = datosadicionales;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public DetalleOrdenDeCompra getDetalleordendecompra() {
        return detalleordendecompra;
    }

    public void setDetalleordendecompra(DetalleOrdenDeCompra detalleordendecompra) {
        this.detalleordendecompra = detalleordendecompra;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCliente_padre() {
        return cliente_padre;
    }

    public void setCliente_padre(String cliente_padre) {
        this.cliente_padre = cliente_padre;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrioridad_de_preparacion() {
        return prioridad_de_preparacion;
    }

    public void setPrioridad_de_preparacion(String prioridad_de_preparacion) {
        this.prioridad_de_preparacion = prioridad_de_preparacion;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getRemito() {
        return remito;
    }

    public void setRemito(String remito) {
        this.remito = remito;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getReferencia_cliente() {
        return referencia_cliente;
    }

    public void setReferencia_cliente(String referencia_cliente) {
        this.referencia_cliente = referencia_cliente;
    }

    public String getCodigo_transportista() {
        return codigo_transportista;
    }

    public void setCodigo_transportista(String codigo_transportista) {
        this.codigo_transportista = codigo_transportista;
    }

    public String getAcondicionamiento_secundario() {
        return acondicionamiento_secundario;
    }

    public void setAcondicionamiento_secundario(String acondicionamiento_secundario) {
        this.acondicionamiento_secundario = acondicionamiento_secundario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getRamo_del_destinatario() {
        return ramo_del_destinatario;
    }

    public void setRamo_del_destinatario(String ramo_del_destinatario) {
        this.ramo_del_destinatario = ramo_del_destinatario;
    }

    public String getId_ejecucion() {
        return id_ejecucion;
    }

    public void setId_ejecucion(String id_ejecucion) {
        this.id_ejecucion = id_ejecucion;
    }

    public String getEmbalaje() {
        return embalaje;
    }

    public void setEmbalaje(String embalaje) {
        this.embalaje = embalaje;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getAdmite_cambio_lote_dirigido() {
        return admite_cambio_lote_dirigido;
    }

    public void setAdmite_cambio_lote_dirigido(String admite_cambio_lote_dirigido) {
        this.admite_cambio_lote_dirigido = admite_cambio_lote_dirigido;
    }

    public String getAdmite_picking_parcial() {
        return admite_picking_parcial;
    }

    public void setAdmite_picking_parcial(String admite_picking_parcial) {
        this.admite_picking_parcial = admite_picking_parcial;
    }

    public Boolean getImprime_documentacion() {
        return imprime_documentacion;
    }

    public String getNro_vale() {
        return nro_vale;
    }

    public void setNro_vale(String nro_vale) {
        this.nro_vale = nro_vale;
    }

    public String getValor_declarado() {
        return valor_declarado;
    }

    public void setValor_declarado(String valor_declarado) {
        this.valor_declarado = valor_declarado;
    }

    public String getCampos_libres() {
        return campos_libres;
    }

    public void setCampos_libres(String campos_libres) {
        this.campos_libres = campos_libres;
    }

    public String getSocio_comercial() {
        return socio_comercial;
    }

    public void setSocio_comercial(String socio_comercial) {
        this.socio_comercial = socio_comercial;
    }

    public String getModo_de_transporte() {
        return modo_de_transporte;
    }

    public void setModo_de_transporte(String modo_de_transporte) {
        this.modo_de_transporte = modo_de_transporte;
    }
}
