package com.miaoji.remoteclass;

import com.miaoji.javarmi.Message;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.io.Serializable;
import java.util.Hashtable;

public class ExportObject extends Message implements ObjectFactory, Serializable {

    private static final long serialVersionUID = 4474289574195395731L;

    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        return null;
    }
}
