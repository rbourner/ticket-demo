package com.bell.brms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TicketSource implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String caEn;
	private java.lang.String caFr;

	public TicketSource() {
	}

	public java.lang.String getCaEn() {
		return this.caEn;
	}

	public void setCaEn(java.lang.String caEn) {
		this.caEn = caEn;
	}

	public java.lang.String getCaFr() {
		return this.caFr;
	}

	public void setCaFr(java.lang.String caFr) {
		this.caFr = caFr;
	}

	public TicketSource(java.lang.String caEn, java.lang.String caFr) {
		this.caEn = caEn;
		this.caFr = caFr;
	}

}