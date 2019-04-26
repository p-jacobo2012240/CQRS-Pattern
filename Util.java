package org.hck.utils;

public class Util{

    /**
    Singleton Impl-Basic
     */
    private String Url;
    private String Data;
    private Boolean Access;

    private static final Util util;

    public static Util getUtil(String Url, String Data, Boolean Access ){

        if(util == null ){
            util = new Util(Url, Data Access );
        }
        return util;

    }

    private Util(String Url, String Data, Boolean Access ){
        this.Url = Url;
        this.Data = Data;
        this.Access = Access;
    }

    /**
    the getters / setters are missing...
     */
}