/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Ingrediente;
import model.Bolo;
import java.util.ArrayList;

/**
 *
 * @author marcosantonio
 */
public class BoloDeTrigo extends Bolo {

    public BoloDeTrigo(double peso, String tipo, ArrayList<Ingrediente> ingredientes, int validade,boolean recheio) {
        infoBolo(peso, tipo, ingredientes, validade, recheio, this.getReceita());
    }

    @Override
    public void prepararMassa() {
        ArrayList<String> receita = this.getReceita();
        receita.add("Modo de Preparo:");
        receita.add("Junte a manteiga, o açúcar e os ovos em uma tigela.");
        receita.add("Em seguida misture tudo com a ajuda de um batedor de arame (fouet).");
        receita.add("Adicione o leite e misture mais um pouco.");
        receita.add("Depois adicione toda a farinha de trigo e continue misturando até formar uma massa bem homogênea.");
        receita.add("Despeje a mistura numa forma untada e enfarinhada.");
        receita.add("Leve ao forno preaquecido, 180º, por cerca 40 minutos ou até dourar.");
        receita.add("Para finalizar eu gosto de salpicar açúcar de confeiteiro por cima. \n");
    }

    @Override
    public void rechear() {}

}
