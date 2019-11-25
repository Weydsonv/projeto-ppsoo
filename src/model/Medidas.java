package model;

/**
 *
 * @author Wey
 */
public enum Medidas {
    XICARAS("xícara(s)"), COLHERES("colher(es)"), COLHERES_SOPA("colher(es) (sopa)"), UNIDADES("unidade(s)"), MLS("mls"), GRAMA("gramas");

    private final String medida;

    private Medidas(String medida) {
        this.medida = medida;
    }

    public String getMedida() {
        return medida;
    }

}
