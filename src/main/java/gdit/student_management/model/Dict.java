package gdit.student_management.model;


public class Dict {

  private Long id;
  private String dictKey;
  private String dictValue;
  private String dictType;
  private String remark;
  private Long status;

  public Dict(String dictKey, String dictValue) {
    this.dictKey=dictKey;
    this.dictValue=dictValue;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getDictKey() {
    return dictKey;
  }

  public void setDictKey(String dictKey) {
    this.dictKey = dictKey;
  }


  public String getDictValue() {
    return dictValue;
  }

  public void setDictValue(String dictValue) {
    this.dictValue = dictValue;
  }


  public String getDictType() {
    return dictType;
  }

  public void setDictType(String dictType) {
    this.dictType = dictType;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

}
