package es.uc3m.tiw.model;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
 	@GeneratedValue(strategy = AUTO)
	private Integer ID_pedido;
	private Integer ImporteCobrar; //lo que viene del portal
	private Integer ImporteCobrado; //99% de lo que viene del portal -- 1% de comision para el banco
	private String COD_tarjeta; //tarjeta de credito del alumno -- 20 posiciones alfanumericas, la primera A/B
	private String COD_operacion; //codigo de operacion bancaria que generara el banco -- BANCOyyyymmddhhssSSSXX
	private String COD_pago; //codigo de pedido que viene del portal -- ORDERyyyymmddhhssSSSXX
	private int ESTADO_conciliado;
	@OneToOne
	private Curso Curso;
	
	public Pedido() {
	}
	
	public Pedido(Integer importeCobrar, String cOD_tarjeta, String cOD_pago, Curso curso, int ESTADO_conciliado) {
		super();
		this.ImporteCobrar = importeCobrar;
		this.COD_tarjeta = cOD_tarjeta;
		this.COD_pago = cOD_pago;
		this.Curso = curso;
		this.ESTADO_conciliado=ESTADO_conciliado;
	}
	
	public Pedido(Integer importeCobrar, Integer importeCobrado, String cOD_tarjeta,
			String cOD_operacion, String cOD_pago, Curso curso, int ESTADO_conciliado) {
		super();
		this.ImporteCobrar = importeCobrar;
		this.ImporteCobrado = importeCobrado;
		this.COD_tarjeta = cOD_tarjeta;
		this.COD_operacion = cOD_operacion;
		this.COD_pago = cOD_pago;
		this.Curso = curso;
		this.ESTADO_conciliado=ESTADO_conciliado;
	}
	
	public Integer getID_pedido() {
		return ID_pedido;
	}
	public void setID_pedido(Integer iD_pedido) {
		this.ID_pedido = iD_pedido;
	}
	public Integer getImporteCobrar() {
		return ImporteCobrar;
	}
	public void setImporteCobrar(Integer importeCobrar) {
		this.ImporteCobrar = importeCobrar;
	}
	public Integer getImporteCobrado() {
		return ImporteCobrado;
	}
	public void setImporteCobrado(Integer importeCobrado) {
		this.ImporteCobrado = importeCobrado;
	}
	public String getCOD_tarjeta() {
		return COD_tarjeta;
	}
	public void setCOD_tarjeta(String cOD_tarjeta) {
		this.COD_tarjeta = cOD_tarjeta;
	}
	public String getCOD_operacion() {
		return COD_operacion;
	}
	public void setCOD_operacion(String cOD_operacion) {
		this.COD_operacion = cOD_operacion;
	}
	public String getCOD_pago() {
		return COD_pago;
	}
	public void setCOD_pago(String cOD_pago) {
		this.COD_pago = cOD_pago;
	}
	public Curso getCurso() {
		return Curso;
	}
	public void setCOD_pago(Curso curso) {
		this.Curso = curso;
	}

	public int getESTADO_conciliado() {
		return ESTADO_conciliado;
	}

	public void setESTADO_conciliado(int ESTADO_conciliado) {
		ESTADO_conciliado = ESTADO_conciliado;
	}

	public void setCurso(Curso curso) {
		Curso = curso;
	}
	
	
}