package com.kvj.erp.purchase.exception;

import com.google.common.base.Verify;
import org.apache.commons.lang.StringUtils;
import org.springframework.lang.NonNull;

public class ExceptionUtil {

    @NonNull
    public static PurchaseModuleException throwMdmModuleExcption(@NonNull final int errorCode,
            @NonNull final String errorMessage) throws PurchaseModuleException {
        Verify.verify(errorCode > 0, "errorCode:incorrect value");
        Verify.verify(StringUtils.isNotBlank(errorMessage), "errorMessage:null");
        throw new PurchaseModuleException(errorCode, errorMessage);
    }
}
