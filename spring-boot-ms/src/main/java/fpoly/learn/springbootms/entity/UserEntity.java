package fpoly.learn.springbootms.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "status")
    private Integer status;

    //Chỗ này được hiểu là :
    //Khi 2 thực thể có mối quan hệ nhiều nhiều tức là ManyToMany --> tạo bảng trung gian bằng các câu mapping bên dưới
    //khi đang viết ở bảng nào thì joinColumn là tên khoá chính đó
    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))

    private List<RoleEntity> roles = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
