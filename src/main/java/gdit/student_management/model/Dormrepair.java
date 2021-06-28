package gdit.student_management.model;

public class Dormrepair {

  private Long rid;
  private Long did;
  private String ddormbuilding;
  private String rname;
  private String reason;
  private java.util.Date createTime;
  private java.util.Date updateTime;


  public Long getRid() {
    return rid;
  }

  public void setRid(Long rid) {
    this.rid = rid;
  }


  public Long getDid() {
    return did;
  }

  public void setDid(Long did) {
    this.did = did;
  }


  public String getDdormbuilding() {
    return ddormbuilding;
  }

  public void setDdormbuilding(String ddormbuilding) {
    this.ddormbuilding = ddormbuilding;
  }


  public String getRname() {
    return rname;
  }

  public void setRname(String rname) {
    this.rname = rname;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.util.Date createTime) {
    this.createTime = createTime;
  }


  public java.util.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.util.Date updateTime) {
    this.updateTime = updateTime;
  }

}
