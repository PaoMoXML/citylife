package com.pojo;

public class Type {
    private Integer typesign;

    private String typename;

    private String typeintro;

    public Integer getTypesign() {
        return typesign;
    }

    public void setTypesign(Integer typesign) {
        this.typesign = typesign;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypeintro() {
        return typeintro;
    }

    public void setTypeintro(String typeintro) {
        this.typeintro = typeintro == null ? null : typeintro.trim();
    }
}