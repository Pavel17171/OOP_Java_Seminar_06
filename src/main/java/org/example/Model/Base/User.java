package org.example.Model.Base;

public abstract class User {
    protected String type;
    protected String fio;
    protected int id;
    protected int exp;
    protected int groupID;

    public User(String type, int id, String fio, int exp, int groupID) {
        this.type = type;
        this.fio = fio;
        this.exp = exp;
        this.id = id;
        this.groupID = groupID;
    }

    public User(int id, String fio, int exp, int groupID) {
        this.fio = fio;
        this.exp = exp;
        this.id = id;
        this.groupID = groupID;
    }

    public User() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }


    @Override
    public String toString() {
        return "User{" +
                ", fio='" + fio +
                ", id=" + id +
                ", exp=" + exp +
                '}';
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}