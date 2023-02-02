package fpoly.learn.springbootms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }
}
