package com.turnos.turnos.TurnosDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Propiedades {

    private String titulo;
    private List<String> secciones = new ArrayList<String>();
    private Map<String,Integer> articulos = new HashMap<String,Integer>();

    public Propiedades()
    {
        titulo = "LOVERS";
        
        secciones.add("INICIO");
        secciones.add("SERVICIOS");
        secciones.add("PRECIOS");
        secciones.add("TURNO");

        articulos.put("SOFTLISO", 14000);
        articulos.put("SOFTDISEÑOSIMPLE", 15500);
        articulos.put("SOFTFULL", 16000);
        articulos.put("SOFTAPLIQUES", 18000);
        articulos.put("SEMI", 9500);
        articulos.put("CAPPING", 9500);
    }
}
