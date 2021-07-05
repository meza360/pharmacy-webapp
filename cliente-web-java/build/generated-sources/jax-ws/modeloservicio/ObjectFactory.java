
package modeloservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the modeloservicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Actualizar_QNAME = new QName("http://ModeloServicio/", "Actualizar");
    private final static QName _ActualizarResponse_QNAME = new QName("http://ModeloServicio/", "ActualizarResponse");
    private final static QName _Eliminar_QNAME = new QName("http://ModeloServicio/", "Eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://ModeloServicio/", "EliminarResponse");
    private final static QName _Agregar_QNAME = new QName("http://ModeloServicio/", "agregar");
    private final static QName _AgregarResponse_QNAME = new QName("http://ModeloServicio/", "agregarResponse");
    private final static QName _InsertarArchivo_QNAME = new QName("http://ModeloServicio/", "insertarArchivo");
    private final static QName _InsertarArchivoResponse_QNAME = new QName("http://ModeloServicio/", "insertarArchivoResponse");
    private final static QName _ListarLaboratorio_QNAME = new QName("http://ModeloServicio/", "listarLaboratorio");
    private final static QName _ListarLaboratorioResponse_QNAME = new QName("http://ModeloServicio/", "listarLaboratorioResponse");
    private final static QName _ListarMedicamentos_QNAME = new QName("http://ModeloServicio/", "listarMedicamentos");
    private final static QName _ListarMedicamentosResponse_QNAME = new QName("http://ModeloServicio/", "listarMedicamentosResponse");
    private final static QName _ListarNombre_QNAME = new QName("http://ModeloServicio/", "listarNombre");
    private final static QName _ListarNombreResponse_QNAME = new QName("http://ModeloServicio/", "listarNombreResponse");
    private final static QName _Listarcodigo_QNAME = new QName("http://ModeloServicio/", "listarcodigo");
    private final static QName _ListarcodigoResponse_QNAME = new QName("http://ModeloServicio/", "listarcodigoResponse");
    private final static QName _VentaActualizar_QNAME = new QName("http://ModeloServicio/", "ventaActualizar");
    private final static QName _VentaActualizarResponse_QNAME = new QName("http://ModeloServicio/", "ventaActualizarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: modeloservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Actualizar }
     * 
     */
    public Actualizar createActualizar() {
        return new Actualizar();
    }

    /**
     * Create an instance of {@link ActualizarResponse }
     * 
     */
    public ActualizarResponse createActualizarResponse() {
        return new ActualizarResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link Agregar }
     * 
     */
    public Agregar createAgregar() {
        return new Agregar();
    }

    /**
     * Create an instance of {@link AgregarResponse }
     * 
     */
    public AgregarResponse createAgregarResponse() {
        return new AgregarResponse();
    }

    /**
     * Create an instance of {@link InsertarArchivo }
     * 
     */
    public InsertarArchivo createInsertarArchivo() {
        return new InsertarArchivo();
    }

    /**
     * Create an instance of {@link InsertarArchivoResponse }
     * 
     */
    public InsertarArchivoResponse createInsertarArchivoResponse() {
        return new InsertarArchivoResponse();
    }

    /**
     * Create an instance of {@link ListarLaboratorio }
     * 
     */
    public ListarLaboratorio createListarLaboratorio() {
        return new ListarLaboratorio();
    }

    /**
     * Create an instance of {@link ListarLaboratorioResponse }
     * 
     */
    public ListarLaboratorioResponse createListarLaboratorioResponse() {
        return new ListarLaboratorioResponse();
    }

    /**
     * Create an instance of {@link ListarMedicamentos }
     * 
     */
    public ListarMedicamentos createListarMedicamentos() {
        return new ListarMedicamentos();
    }

    /**
     * Create an instance of {@link ListarMedicamentosResponse }
     * 
     */
    public ListarMedicamentosResponse createListarMedicamentosResponse() {
        return new ListarMedicamentosResponse();
    }

    /**
     * Create an instance of {@link ListarNombre }
     * 
     */
    public ListarNombre createListarNombre() {
        return new ListarNombre();
    }

    /**
     * Create an instance of {@link ListarNombreResponse }
     * 
     */
    public ListarNombreResponse createListarNombreResponse() {
        return new ListarNombreResponse();
    }

    /**
     * Create an instance of {@link Listarcodigo }
     * 
     */
    public Listarcodigo createListarcodigo() {
        return new Listarcodigo();
    }

    /**
     * Create an instance of {@link ListarcodigoResponse }
     * 
     */
    public ListarcodigoResponse createListarcodigoResponse() {
        return new ListarcodigoResponse();
    }

    /**
     * Create an instance of {@link VentaActualizar }
     * 
     */
    public VentaActualizar createVentaActualizar() {
        return new VentaActualizar();
    }

    /**
     * Create an instance of {@link VentaActualizarResponse }
     * 
     */
    public VentaActualizarResponse createVentaActualizarResponse() {
        return new VentaActualizarResponse();
    }

    /**
     * Create an instance of {@link Medicamento }
     * 
     */
    public Medicamento createMedicamento() {
        return new Medicamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Actualizar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "Actualizar")
    public JAXBElement<Actualizar> createActualizar(Actualizar value) {
        return new JAXBElement<Actualizar>(_Actualizar_QNAME, Actualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "ActualizarResponse")
    public JAXBElement<ActualizarResponse> createActualizarResponse(ActualizarResponse value) {
        return new JAXBElement<ActualizarResponse>(_ActualizarResponse_QNAME, ActualizarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "Eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "EliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Agregar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "agregar")
    public JAXBElement<Agregar> createAgregar(Agregar value) {
        return new JAXBElement<Agregar>(_Agregar_QNAME, Agregar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "agregarResponse")
    public JAXBElement<AgregarResponse> createAgregarResponse(AgregarResponse value) {
        return new JAXBElement<AgregarResponse>(_AgregarResponse_QNAME, AgregarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarArchivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarArchivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "insertarArchivo")
    public JAXBElement<InsertarArchivo> createInsertarArchivo(InsertarArchivo value) {
        return new JAXBElement<InsertarArchivo>(_InsertarArchivo_QNAME, InsertarArchivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarArchivoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarArchivoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "insertarArchivoResponse")
    public JAXBElement<InsertarArchivoResponse> createInsertarArchivoResponse(InsertarArchivoResponse value) {
        return new JAXBElement<InsertarArchivoResponse>(_InsertarArchivoResponse_QNAME, InsertarArchivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLaboratorio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLaboratorio }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarLaboratorio")
    public JAXBElement<ListarLaboratorio> createListarLaboratorio(ListarLaboratorio value) {
        return new JAXBElement<ListarLaboratorio>(_ListarLaboratorio_QNAME, ListarLaboratorio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLaboratorioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarLaboratorioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarLaboratorioResponse")
    public JAXBElement<ListarLaboratorioResponse> createListarLaboratorioResponse(ListarLaboratorioResponse value) {
        return new JAXBElement<ListarLaboratorioResponse>(_ListarLaboratorioResponse_QNAME, ListarLaboratorioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMedicamentos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarMedicamentos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarMedicamentos")
    public JAXBElement<ListarMedicamentos> createListarMedicamentos(ListarMedicamentos value) {
        return new JAXBElement<ListarMedicamentos>(_ListarMedicamentos_QNAME, ListarMedicamentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMedicamentosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarMedicamentosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarMedicamentosResponse")
    public JAXBElement<ListarMedicamentosResponse> createListarMedicamentosResponse(ListarMedicamentosResponse value) {
        return new JAXBElement<ListarMedicamentosResponse>(_ListarMedicamentosResponse_QNAME, ListarMedicamentosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNombre }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarNombre }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarNombre")
    public JAXBElement<ListarNombre> createListarNombre(ListarNombre value) {
        return new JAXBElement<ListarNombre>(_ListarNombre_QNAME, ListarNombre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNombreResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarNombreResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarNombreResponse")
    public JAXBElement<ListarNombreResponse> createListarNombreResponse(ListarNombreResponse value) {
        return new JAXBElement<ListarNombreResponse>(_ListarNombreResponse_QNAME, ListarNombreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listarcodigo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listarcodigo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarcodigo")
    public JAXBElement<Listarcodigo> createListarcodigo(Listarcodigo value) {
        return new JAXBElement<Listarcodigo>(_Listarcodigo_QNAME, Listarcodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarcodigoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarcodigoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "listarcodigoResponse")
    public JAXBElement<ListarcodigoResponse> createListarcodigoResponse(ListarcodigoResponse value) {
        return new JAXBElement<ListarcodigoResponse>(_ListarcodigoResponse_QNAME, ListarcodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VentaActualizar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VentaActualizar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "ventaActualizar")
    public JAXBElement<VentaActualizar> createVentaActualizar(VentaActualizar value) {
        return new JAXBElement<VentaActualizar>(_VentaActualizar_QNAME, VentaActualizar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VentaActualizarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VentaActualizarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ModeloServicio/", name = "ventaActualizarResponse")
    public JAXBElement<VentaActualizarResponse> createVentaActualizarResponse(VentaActualizarResponse value) {
        return new JAXBElement<VentaActualizarResponse>(_VentaActualizarResponse_QNAME, VentaActualizarResponse.class, null, value);
    }

}
