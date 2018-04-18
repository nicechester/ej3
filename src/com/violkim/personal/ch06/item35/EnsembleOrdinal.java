package com.violkim.personal.ch06.item35;

public enum EnsembleOrdinal {
    SOLO,   DUET,   TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET,  DECTET
//    , DOUBLE_QUARTET
    ;

    public int numberOfMusicians() { return ordinal() + 1; }
}