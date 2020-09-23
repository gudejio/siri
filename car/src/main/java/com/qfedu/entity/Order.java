package com.qfedu.entity;

/**
 * projectName: car
 *
 * @author: xr
 * time: 2020/9/17 19:26
 * description:
 */

public class Order {
    private int id;
    private int cid;
    private int uid;
    private int getid;
    private int backid;
    private double oprice;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGetid() {
        return getid;
    }

    public void setGetid(int getid) {
        this.getid = getid;
    }

    public int getBackid() {
        return backid;
    }

    public void setBackid(int backid) {
        this.backid = backid;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cid=" + cid +
                ", uid=" + uid +
                ", getid=" + getid +
                ", backid=" + backid +
                ", oprice=" + oprice +
                ", status='" + status + '\'' +
                '}';
    }
}
