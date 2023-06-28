package com.example.entity;


public class Department {

  private long id;
  private String departmentName;
  private long managerId;
  private long departNumber;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public long getManagerId() {
    return managerId;
  }

  public void setManagerId(long managerId) {
    this.managerId = managerId;
  }


  public long getDepartNumber() {
    return departNumber;
  }

  public void setDepartNumber(long departNumber) {
    this.departNumber = departNumber;
  }

}
