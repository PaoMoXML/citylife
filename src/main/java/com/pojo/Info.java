package com.pojo;

import java.util.Date;

public class Info {
    private Integer id;

    private Integer infotype;

    private String infotitle;

    private String infocontent;

    private String infolinkman;

    private String infophone;

    private String infoemail;

    private Date infodate;

    private String infocheck;

    private String infopayfor;

    private String infostatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInfotype() {
        return infotype;
    }

    public void setInfotype(Integer infotype) {
        this.infotype = infotype;
    }

    public String getInfotitle() {
        return infotitle;
    }

    public void setInfotitle(String infotitle) {
        this.infotitle = infotitle == null ? null : infotitle.trim();
    }

    public String getInfocontent() {
        return infocontent;
    }

    public void setInfocontent(String infocontent) {
        this.infocontent = infocontent == null ? null : infocontent.trim();
    }

    public String getInfolinkman() {
        return infolinkman;
    }

    public void setInfolinkman(String infolinkman) {
        this.infolinkman = infolinkman == null ? null : infolinkman.trim();
    }

    public String getInfophone() {
        return infophone;
    }

    public void setInfophone(String infophone) {
        this.infophone = infophone == null ? null : infophone.trim();
    }

    public String getInfoemail() {
        return infoemail;
    }

    public void setInfoemail(String infoemail) {
        this.infoemail = infoemail == null ? null : infoemail.trim();
    }

    public Date getInfodate() {
        return infodate;
    }

    public void setInfodate(Date infodate) {
        this.infodate = infodate;
    }

    public String getInfocheck() {
        return infocheck;
    }

    public void setInfocheck(String infocheck) {
        this.infocheck = infocheck == null ? null : infocheck.trim();
    }

    public String getInfopayfor() {
        return infopayfor;
    }

    public void setInfopayfor(String infopayfor) {
        this.infopayfor = infopayfor == null ? null : infopayfor.trim();
    }

    public String getInfostatus() {
        return infostatus;
    }

    public void setInfostatus(String infostatus) {
        this.infostatus = infostatus == null ? null : infostatus.trim();
    }
}