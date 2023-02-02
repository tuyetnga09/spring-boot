package fpoly.learn.springbootms.api;
import org.springframework.web.bind.annotation.*;
import fpoly.learn.springbootms.dto.NewDTO;
//Tại sao ở đây lại có @RestController
//RestController: để định nghĩa đây là 1 web-service. Nếu không đây là 1 java class.
//GetMapping: giúp chúng ta nhận request. ("/test": URL)
//RestController = @Controller + @ResponseBody
@RestController
public class NewAPI {
    //@GetMapping("/test") =
    //@RequestMapping: nhận request vào
    /*1 số nguyên tắc khi viết API:
        - Tên api phải là danh từ
        - http method phải đúng với thao tác
          Method đúng với thao tác: Thêm: POST
                                    Sửa: PUT
                                    Xóa: DELETE
                                    Hiển thị dữ liệu: GET*/

    //Cách thông thường khi chưa có famework
    //@RequestMapping(value = "/new", method = RequestMethod.POST)
    //Hàm thêm: @PostMapping = @RequestMapping + method
   @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {
        return model;
    }
    //Hàm cập nhật
    @PutMapping(value = "/new")
    public NewDTO updateNew(@RequestBody NewDTO model) {
        return model;
    }

    //Hàm xoá
    //Cái mà nhận vào không phải là NewDTO như các hàm trước 
    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids) {
    }
}
