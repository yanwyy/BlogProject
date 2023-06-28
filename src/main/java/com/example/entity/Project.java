package com.example.entity;


public class Project {

  private long id;
  private String projName;
  private long managerId;
  private String startDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProjName() {
    return projName;
  }

  public void setProjName(String projName) {
    this.projName = projName;
  }


  public long getManagerId() {
    return managerId;
  }

  public void setManagerId(long managerId) {
    this.managerId = managerId;
  }


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

}
