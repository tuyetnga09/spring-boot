package fpoly.learn.springbootms.api;
import org.springframework.web.bind.annotation.*;
import fpoly.learn.springbootms.dto.NewDTO;
//Tại sao ở đây lại có @RestController
//RestController: để định nghĩa đây là 1 web-service. Nếu không đây là 1 java class.
//GetMapping: giúp chúng ta nhận request. ("/test": URL)

@RestController
public class NewAPI {
//    @GetMapping("/test")
    @RequestMapping(value = "/new", method = RequestMethod.POST)

    @ResponseBody
    public NewDTO createNew(@RequestBody NewDTO model) {

        return model;

    }
}
