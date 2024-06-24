package com.miLiteralura.Literalura_Jimena.serviceAPI;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
