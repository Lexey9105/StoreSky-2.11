package pro.sky.StoreSky_21;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    private final StoreServise storeServise;

    public StoreController(StoreServise storeServise){
        this.storeServise=storeServise;
    }
    @GetMapping("/add")
    public Integer add(@RequestParam Integer id){
        storeServise.add(id);
        return id;
    }
    @GetMapping("/get")
    public List<Integer> get(){
        return storeServise.get();
    }
}
