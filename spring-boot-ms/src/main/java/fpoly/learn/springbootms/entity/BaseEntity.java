package fpoly.learn.springbootms.entity;

import jakarta.persistence.*;

import java.util.Date;
//Tại sao phải có @MappedSupperClass: khi tạo table từ những Entity con  nó sẽ hiểu những cái thay đổi
// của cha sẽ apply cho những thằng con
//Và khi tạo table cho những entity con sẽ tự động có: id, createBy,...
@MappedSuperclass
public abstract class BaseEntity {
    /*@Id: có 2 chức năng
          1- Not null
          2- khoá chính
      @GeneratedValue: tự tăng
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "createBy")
    private String createdBy;
    @Column(name = "modifiedBy")
    private String modifiedBy;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "modifiedDate")
    private Date modifiedDate;

    public Long getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
