/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class CursoDeBolosTradicionais extends CursoDeBolos {

    @Override
    public Bolo criarBolo(String tipo, double pesoBolo, boolean recheio) {

        switch (tipo) {
            case TipoDeBolo.TRIGO: {
                ArrayList<Ingrediente> ingredientesBoloDeTrigo = new ArrayList<>();
                ingredientesBoloDeTrigo.add(new Ingrediente("farinha de trigo", 3 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeTrigo.add(new Ingrediente("açúcar", 2 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeTrigo.add(new Ingrediente("ovo(s)", 3 * pesoBolo, Medidas.UNIDADES.getMedida()));
                ingredientesBoloDeTrigo.add(new Ingrediente("leite", 200 * pesoBolo, Medidas.MLS.getMedida()));
                ingredientesBoloDeTrigo.add(new Ingrediente("manteiga", 4 * pesoBolo, Medidas.COLHERES_SOPA.getMedida()));
                ingredientesBoloDeTrigo.add(new Ingrediente("fermento biológico em pó", 1 * pesoBolo, Medidas.COLHERES_SOPA.getMedida()));

                return new BoloDeTrigo(pesoBolo, "trigo", ingredientesBoloDeTrigo, 15, recheio);
            }

            case TipoDeBolo.LARANJA: {
                ArrayList<Ingrediente> ingredientesBoloDeLaranja = new ArrayList<>();
                ingredientesBoloDeLaranja.add(new Ingrediente("ovo(s)", 4 * pesoBolo, Medidas.UNIDADES.getMedida()));
                ingredientesBoloDeLaranja.add(new Ingrediente("açúcar", 2 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeLaranja.add(new Ingrediente("óleo", 1 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeLaranja.add(new Ingrediente("laranja(suco)", 2 * pesoBolo, Medidas.UNIDADES.getMedida()));
                ingredientesBoloDeLaranja.add(new Ingrediente("casca de laranja", 1 * pesoBolo, Medidas.UNIDADES.getMedida()));
                ingredientesBoloDeLaranja.add(new Ingrediente("farinha de trigo", 2 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeLaranja.add(new Ingrediente("fermento", 1 * pesoBolo, Medidas.COLHERES.getMedida()));

                return new BoloDeLaranja(pesoBolo, "laranja", ingredientesBoloDeLaranja, 10, recheio);
            }

            case TipoDeBolo.MANDIOCA: {
                ArrayList<Ingrediente> ingredientesBoloDeMandioca = new ArrayList<>();
                ingredientesBoloDeMandioca.add(new Ingrediente("mandioca ralada grossa", 3 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("açúcar", 1.5 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("manteiga", 3 * pesoBolo, Medidas.COLHERES.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("farinha de trigo", 1.5 * pesoBolo, Medidas.XICARAS.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("ovo(s)", 4 * pesoBolo, Medidas.UNIDADES.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("coco ralado", 50 * pesoBolo, Medidas.GRAMA.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("queijo ralado", 50 * pesoBolo, Medidas.GRAMA.getMedida()));
                ingredientesBoloDeMandioca.add(new Ingrediente("fermento em pó", 1 * pesoBolo, Medidas.COLHERES_SOPA.getMedida()));

                return new BoloDeMandioca(pesoBolo, "mandioca", ingredientesBoloDeMandioca, 10, recheio);
            }

            default:
                return null;
        }
    }
}
