//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.9
//
// <auto-generated>
//
// Generated from file `AppInterfaces.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package AppInterfaces;

public interface Broker extends com.zeroc.Ice.Object
{
    void addServer(ServerPrx server, com.zeroc.Ice.Current current);

    void solveIntegral(ClientPrx clientProxy, Integral integral, com.zeroc.Ice.Current current);

    void join(int requestID, String res, com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::AppInterfaces::Broker",
        "::Ice::Object"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::AppInterfaces::Broker";
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_addServer(Broker obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        ServerPrx iceP_server;
        iceP_server = ServerPrx.uncheckedCast(istr.readProxy());
        inS.endReadParams();
        obj.addServer(iceP_server, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_solveIntegral(Broker obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        ClientPrx iceP_clientProxy;
        final com.zeroc.IceInternal.Holder<Integral> icePP_integral = new com.zeroc.IceInternal.Holder<>();
        iceP_clientProxy = ClientPrx.uncheckedCast(istr.readProxy());
        istr.readValue(v -> icePP_integral.value = v, Integral.class);
        istr.readPendingValues();
        inS.endReadParams();
        Integral iceP_integral = icePP_integral.value;
        obj.solveIntegral(iceP_clientProxy, iceP_integral, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /**
     * @hidden
     * @param obj -
     * @param inS -
     * @param current -
     * @return -
    **/
    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_join(Broker obj, final com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_requestID;
        String iceP_res;
        iceP_requestID = istr.readInt();
        iceP_res = istr.readString();
        inS.endReadParams();
        obj.join(iceP_requestID, iceP_res, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    /** @hidden */
    final static String[] _iceOps =
    {
        "addServer",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "join",
        "solveIntegral"
    };

    /** @hidden */
    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return _iceD_addServer(this, in, current);
            }
            case 1:
            {
                return com.zeroc.Ice.Object._iceD_ice_id(this, in, current);
            }
            case 2:
            {
                return com.zeroc.Ice.Object._iceD_ice_ids(this, in, current);
            }
            case 3:
            {
                return com.zeroc.Ice.Object._iceD_ice_isA(this, in, current);
            }
            case 4:
            {
                return com.zeroc.Ice.Object._iceD_ice_ping(this, in, current);
            }
            case 5:
            {
                return _iceD_join(this, in, current);
            }
            case 6:
            {
                return _iceD_solveIntegral(this, in, current);
            }
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }
}