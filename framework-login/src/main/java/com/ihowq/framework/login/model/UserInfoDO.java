package com.ihowq.framework.login.model;

import java.util.Date;

/**
 * @author howq
 */
public class UserInfoDO {

    private static final long serialVersionUID = 1L;

    private String userid;

    private Byte roleid;

    private String majorid;

    private String username;

    private String sextype;

    private String usertel;

    private String usermobile;

    private String useremail;

    private String creater;

    private Date creatdatetime;

    private String changer;

    private Date changedatetime;

    private String deleteman;

    private Date deletedatetime;

    private String deleteflg;

    /**
     * Getter for property 'userid'.
     *
     * @return Value for property 'userid'.
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Setter for property 'userid'.
     *
     * @param userid Value to set for property 'userid'.
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * Getter for property 'roleid'.
     *
     * @return Value for property 'roleid'.
     */
    public Byte getRoleid() {
        return roleid;
    }

    /**
     * Setter for property 'roleid'.
     *
     * @param roleid Value to set for property 'roleid'.
     */
    public void setRoleid(Byte roleid) {
        this.roleid = roleid;
    }

    /**
     * Getter for property 'majorid'.
     *
     * @return Value for property 'majorid'.
     */
    public String getMajorid() {
        return majorid;
    }

    /**
     * Setter for property 'majorid'.
     *
     * @param majorid Value to set for property 'majorid'.
     */
    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    /**
     * Getter for property 'username'.
     *
     * @return Value for property 'username'.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for property 'username'.
     *
     * @param username Value to set for property 'username'.
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * Getter for property 'sextype'.
     *
     * @return Value for property 'sextype'.
     */
    public String getSextype() {
        return sextype;
    }

    /**
     * Setter for property 'sextype'.
     *
     * @param sextype Value to set for property 'sextype'.
     */
    public void setSextype(String sextype) {
        this.sextype = sextype == null ? null : sextype.trim();
    }

    /**
     * Getter for property 'usertel'.
     *
     * @return Value for property 'usertel'.
     */
    public String getUsertel() {
        return usertel;
    }

    /**
     * Setter for property 'usertel'.
     *
     * @param usertel Value to set for property 'usertel'.
     */
    public void setUsertel(String usertel) {
        this.usertel = usertel == null ? null : usertel.trim();
    }

    /**
     * Getter for property 'usermobile'.
     *
     * @return Value for property 'usermobile'.
     */
    public String getUsermobile() {
        return usermobile;
    }

    /**
     * Setter for property 'usermobile'.
     *
     * @param usermobile Value to set for property 'usermobile'.
     */
    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    /**
     * Getter for property 'useremail'.
     *
     * @return Value for property 'useremail'.
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * Setter for property 'useremail'.
     *
     * @param useremail Value to set for property 'useremail'.
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    /**
     * Getter for property 'creater'.
     *
     * @return Value for property 'creater'.
     */
    public String getCreater() {
        return creater;
    }

    /**
     * Setter for property 'creater'.
     *
     * @param creater Value to set for property 'creater'.
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * Getter for property 'creatdatetime'.
     *
     * @return Value for property 'creatdatetime'.
     */
    public Date getCreatdatetime() {
        return creatdatetime;
    }

    /**
     * Setter for property 'creatdatetime'.
     *
     * @param creatdatetime Value to set for property 'creatdatetime'.
     */
    public void setCreatdatetime(Date creatdatetime) {
        this.creatdatetime = creatdatetime;
    }

    /**
     * Getter for property 'changer'.
     *
     * @return Value for property 'changer'.
     */
    public String getChanger() {
        return changer;
    }

    /**
     * Setter for property 'changer'.
     *
     * @param changer Value to set for property 'changer'.
     */
    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    /**
     * Getter for property 'changedatetime'.
     *
     * @return Value for property 'changedatetime'.
     */
    public Date getChangedatetime() {
        return changedatetime;
    }

    /**
     * Setter for property 'changedatetime'.
     *
     * @param changedatetime Value to set for property 'changedatetime'.
     */
    public void setChangedatetime(Date changedatetime) {
        this.changedatetime = changedatetime;
    }

    /**
     * Getter for property 'deleteman'.
     *
     * @return Value for property 'deleteman'.
     */
    public String getDeleteman() {
        return deleteman;
    }

    /**
     * Setter for property 'deleteman'.
     *
     * @param deleteman Value to set for property 'deleteman'.
     */
    public void setDeleteman(String deleteman) {
        this.deleteman = deleteman == null ? null : deleteman.trim();
    }

    /**
     * Getter for property 'deletedatetime'.
     *
     * @return Value for property 'deletedatetime'.
     */
    public Date getDeletedatetime() {
        return deletedatetime;
    }

    /**
     * Setter for property 'deletedatetime'.
     *
     * @param deletedatetime Value to set for property 'deletedatetime'.
     */
    public void setDeletedatetime(Date deletedatetime) {
        this.deletedatetime = deletedatetime;
    }

    /**
     * Getter for property 'deleteflg'.
     *
     * @return Value for property 'deleteflg'.
     */
    public String getDeleteflg() {
        return deleteflg;
    }

    /**
     * Setter for property 'deleteflg'.
     *
     * @param deleteflg Value to set for property 'deleteflg'.
     */
    public void setDeleteflg(String deleteflg) {
        this.deleteflg = deleteflg == null ? null : deleteflg.trim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "UserInfoDO{" +
                "userid='" + userid + '\'' +
                ", roleid=" + roleid +
                ", majorid='" + majorid + '\'' +
                ", username='" + username + '\'' +
                ", sextype='" + sextype + '\'' +
                ", usertel='" + usertel + '\'' +
                ", usermobile='" + usermobile + '\'' +
                ", useremail='" + useremail + '\'' +
                ", creater='" + creater + '\'' +
                ", creatdatetime=" + creatdatetime +
                ", changer='" + changer + '\'' +
                ", changedatetime=" + changedatetime +
                ", deleteman='" + deleteman + '\'' +
                ", deletedatetime=" + deletedatetime +
                ", deleteflg='" + deleteflg + '\'' +
                '}';
    }
}