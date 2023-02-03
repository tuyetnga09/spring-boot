package fpoly.learn.springbootms.repository;

import fpoly.learn.springbootms.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

//T: bảng muốn thao tác
//Ở đây mình đang thao tác trên bảng NewEntity --> T = NewEntity
//Serializable: kiểu dữ liệu của khoá chính( Id)

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
