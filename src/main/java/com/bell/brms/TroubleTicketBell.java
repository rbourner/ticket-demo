package com.bell.brms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TroubleTicketBell implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.bell.brms.TicketSource source;

	private java.lang.String priority;

	public TroubleTicketBell() {
	}

	public com.bell.brms.TicketSource getSource() {
		return this.source;
	}

	public void setSource(com.bell.brms.TicketSource source) {
		this.source = source;
	}

	public java.lang.String getPriority() {
		return this.priority;
	}

	public void setPriority(java.lang.String priority) {
		this.priority = priority;
	}

	public TroubleTicketBell(com.bell.brms.TicketSource source,
			java.lang.String priority) {
		this.source = source;
		this.priority = priority;
	}

}