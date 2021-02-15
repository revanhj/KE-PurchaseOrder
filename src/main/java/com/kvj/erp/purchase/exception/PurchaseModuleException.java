package com.kvj.erp.purchase.exception;

 
public class PurchaseModuleException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6816013439427589979L;

	public static final int DEFAULT_ERROR_CODE = 1;

    private int errorCode;

    public PurchaseModuleException(final int errorCode, final String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;

    }

     
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        PurchaseModuleException that = (PurchaseModuleException) o;

        return getErrorCode() == that.getErrorCode();
    }

    @Override
    public int hashCode() {
        return getErrorCode();
    }

    @Override
    public String toString() {
        return "MdmModuleException{" + "errorCode=" + errorCode + '}';
    }
}
