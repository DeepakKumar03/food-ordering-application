//package com.upgrad.FoodOrderingApp.service.entity;
//
//import javax.persistence.*;
//import javax.validation.constraints.Size;
//
//@Entity
//@Table(name = "category", schema = "public")
//public class CategoryEntity {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name = "id")
//  private Integer id;
//
//  @Column(name = "uuid")
//  @Size(max = 200)
//  private String uuid;
//
//  @Column(name = "category_name")
//  @Size(max = 225)
//  private String categoryName;
//
//  public Integer getId() {
//    return id;
//  }
//
//  public void setId(Integer id) {
//    this.id = id;
//  }
//
//  public String getUuid() {
//    return uuid;
//  }
//
//  public void setUuid(String uuid) {
//    this.uuid = uuid;
//  }
//
//  public String getCategoryName() {
//    return categoryName;
//  }
//
//  public void setCategoryName(String categoryName) {
//    this.categoryName = categoryName;
//  }
//}
