package gdit.student_management.model;

public class Report {

  private Long id;
  private java.util.Date createTime;
  private String applicant;
  private Long ssex;
  private String sclass;
  private String snumber;
  private String reason;
  private String duration;
  private String description;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public java.util.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getApplicant() {
    return applicant;
  }

  public void setApplicant(String applicant) {
    this.applicant = applicant;
  }


  public Long getSsex() {
    return ssex;
  }

  public void setSsex(Long ssex) {
    this.ssex = ssex;
  }


  public String getSclass() {
    return sclass;
  }

  public void setSclass(String sclass) {
    this.sclass = sclass;
  }


  public String getSnumber() {
    return snumber;
  }

  public void setSnumber(String snumber) {
    this.snumber = snumber;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
