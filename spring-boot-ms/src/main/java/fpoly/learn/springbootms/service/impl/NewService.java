package fpoly.learn.springbootms.service.impl;

import fpoly.learn.springbootms.repository.NewRepository;
import fpoly.learn.springbootms.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;

public class NewService implements INewService {

    //Nhúng Repository để sử dụng --> sd: @Autowired
    //Để thực thi được cơ chế @Autowired: cần phải có những dấu hiệu, ký hiệu để @Autowired  
    @Autowired
    private NewRepository newRepository;

}
