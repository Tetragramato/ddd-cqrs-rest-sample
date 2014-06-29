package com.tetragramato.domain.adresse.type;

/**
 * Created by viviboss on 29/06/2014.
 */
public enum TypeCommandAdresse {
    CREATE("AdresseCreateCommand"),
    UPDATE_ALL("AdresseUpdateAllCommand"),
    UPDATE_LIGNE("AdresseUpdateLigneCommand");

    private String value;

    private TypeCommandAdresse(String value) {
        this.value = value;
    }

    public static TypeCommandAdresse getByValue(String value) {
        for (TypeCommandAdresse type : TypeCommandAdresse.values()) {
            if (value.equals(type.getValue())) {
                return type;
            }
        }
        throw new IllegalArgumentException(String.format("La valeur %s", value));
    }

    public String getValue() {
        return value;
    }
}
