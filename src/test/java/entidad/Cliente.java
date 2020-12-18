package entidad;

public class Cliente {
	@Override
	public String toString() {
		return "Cliente [lineaNegocio=" + lineaNegocio + ", ramo=" + ramo + ", producto=" + producto + ", rol=" + rol
				+ ", titulo=" + titulo + ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", RFC=" + RFC
				+ ", CURP=" + CURP + ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", tipoIdentificacion="
				+ tipoIdentificacion + ", numeroIdentificacion=" + numeroIdentificacion + ", NSS=" + NSS
				+ ", paisNacimiento=" + paisNacimiento + ", estadoProvincia=" + estadoProvincia
				+ ", ciudadPoblacionNacimiento=" + ciudadPoblacionNacimiento + ", nacionalidad=" + nacionalidad
				+ ", tipoDireccion=" + tipoDireccion + ", calleAvenida=" + calleAvenida + ", numeroExterior="
				+ numeroExterior + ", codigoPostal=" + codigoPostal + ", coloniaBarrio=" + coloniaBarrio
				+ ", municipioDelegacion=" + municipioDelegacion + ", ciudadPoblacion=" + ciudadPoblacion + ", estado="
				+ estado + ", tipoTelefono=" + tipoTelefono + ", numeroTelefono=" + numeroTelefono
				+ ", ocupacionProfeccion=" + ocupacionProfeccion + ", claveOcupacionProfeccion="
				+ claveOcupacionProfeccion + ", detalleOcupacion=" + detalleOcupacion + ", ingresoMensualAproximado="
				+ ingresoMensualAproximado + ", transaccionesAnualesAportaciones=" + transaccionesAnualesAportaciones
				+ ", transaccionesAnualesRetiros=" + transaccionesAnualesRetiros
				+ ", montoTransaccionesAnualesAportaciones=" + montoTransaccionesAnualesAportaciones
				+ ", montoTransaccionesAnualesRetiros=" + montoTransaccionesAnualesRetiros + ", funcionesPublicas="
				+ funcionesPublicas + ", limitarDivulgacion=" + limitarDivulgacion + "]";
	}
	private String lineaNegocio;
	private String ramo;
	private String producto;
	private String rol;
	private String titulo;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String fechaNacimiento;
	private String RFC;
	private String CURP;
	private String genero;
	private String estadoCivil;
	private String tipoIdentificacion;
	private String numeroIdentificacion;
	private String NSS;
	private String paisNacimiento;
	private String estadoProvincia;
	private String ciudadPoblacionNacimiento;
	private String nacionalidad;
	private String tipoDireccion;
	private String calleAvenida;
	private String numeroExterior;
	private String codigoPostal;
	private String coloniaBarrio;
	private String municipioDelegacion;
	private String ciudadPoblacion;
	private String estado;
	private String tipoTelefono;
	private String numeroTelefono;
	private String ocupacionProfeccion;
	private String claveOcupacionProfeccion;
	private String detalleOcupacion;
	private String ingresoMensualAproximado;
	private String transaccionesAnualesAportaciones;
	private String transaccionesAnualesRetiros;
	private String montoTransaccionesAnualesAportaciones;
	private String montoTransaccionesAnualesRetiros;
	private String funcionesPublicas;
	private String limitarDivulgacion;
	public String getLineaNegocio() {
		return lineaNegocio;
	}
	public void setLineaNegocio(String lineaNegocio) {
		this.lineaNegocio = lineaNegocio;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public String getCURP() {
		return CURP;
	}
	public void setCURP(String cURP) {
		CURP = cURP;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	public String getEstadoProvincia() {
		return estadoProvincia;
	}
	public void setEstadoProvincia(String estadoProvincia) {
		this.estadoProvincia = estadoProvincia;
	}
	public String getCiudadPoblacionNacimiento() {
		return ciudadPoblacionNacimiento;
	}
	public void setCiudadPoblacionNacimiento(String ciudadPoblacionNacimiento) {
		this.ciudadPoblacionNacimiento = ciudadPoblacionNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getTipoDireccion() {
		return tipoDireccion;
	}
	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}
	public String getCalleAvenida() {
		return calleAvenida;
	}
	public void setCalleAvenida(String calleAvenida) {
		this.calleAvenida = calleAvenida;
	}
	public String getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getColoniaBarrio() {
		return coloniaBarrio;
	}
	public void setColoniaBarrio(String coloniaBarrio) {
		this.coloniaBarrio = coloniaBarrio;
	}
	public String getMunicipioDelegacion() {
		return municipioDelegacion;
	}
	public void setMunicipioDelegacion(String municipioDelegacion) {
		this.municipioDelegacion = municipioDelegacion;
	}
	public String getCiudadPoblacion() {
		return ciudadPoblacion;
	}
	public void setCiudadPoblacion(String ciudadPoblacion) {
		this.ciudadPoblacion = ciudadPoblacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoTelefono() {
		return tipoTelefono;
	}
	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getOcupacionProfeccion() {
		return ocupacionProfeccion;
	}
	public void setOcupacionProfeccion(String ocupacionProfeccion) {
		this.ocupacionProfeccion = ocupacionProfeccion;
	}
	public String getClaveOcupacionProfeccion() {
		return claveOcupacionProfeccion;
	}
	public void setClaveOcupacionProfeccion(String claveOcupacionProfeccion) {
		this.claveOcupacionProfeccion = claveOcupacionProfeccion;
	}
	public String getDetalleOcupacion() {
		return detalleOcupacion;
	}
	public void setDetalleOcupacion(String detalleOcupacion) {
		this.detalleOcupacion = detalleOcupacion;
	}
	public String getIngresoMensualAproximado() {
		return ingresoMensualAproximado;
	}
	public void setIngresoMensualAproximado(String ingresoMensualAproximado) {
		this.ingresoMensualAproximado = ingresoMensualAproximado;
	}
	public String getTransaccionesAnualesAportaciones() {
		return transaccionesAnualesAportaciones;
	}
	public void setTransaccionesAnualesAportaciones(String transaccionesAnualesAportaciones) {
		this.transaccionesAnualesAportaciones = transaccionesAnualesAportaciones;
	}
	public String getTransaccionesAnualesRetiros() {
		return transaccionesAnualesRetiros;
	}
	public void setTransaccionesAnualesRetiros(String transaccionesAnualesRetiros) {
		this.transaccionesAnualesRetiros = transaccionesAnualesRetiros;
	}
	public String getMontoTransaccionesAnualesAportaciones() {
		return montoTransaccionesAnualesAportaciones;
	}
	public void setMontoTransaccionesAnualesAportaciones(String montoTransaccionesAnualesAportaciones) {
		this.montoTransaccionesAnualesAportaciones = montoTransaccionesAnualesAportaciones;
	}
	public String getMontoTransaccionesAnualesRetiros() {
		return montoTransaccionesAnualesRetiros;
	}
	public void setMontoTransaccionesAnualesRetiros(String montoTransaccionesAnualesRetiros) {
		this.montoTransaccionesAnualesRetiros = montoTransaccionesAnualesRetiros;
	}
	public String getFuncionesPublicas() {
		return funcionesPublicas;
	}
	public void setFuncionesPublicas(String funcionesPublicas) {
		this.funcionesPublicas = funcionesPublicas;
	}
	public String getLimitarDivulgacion() {
		return limitarDivulgacion;
	}
	public void setLimitarDivulgacion(String limitarDivulgacion) {
		this.limitarDivulgacion = limitarDivulgacion;
	}


}
