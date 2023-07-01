package pro.sky.StoreSky_21;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@Service
@SessionScope
public class StoreServiseImpl implements StoreServise {
    private final List<Integer> storeStorage;

    public StoreServiseImpl(){
        this.storeStorage=new ArrayList<>();
    }

    @Override
    public List<Integer>  add(List<Integer> ids) {
        for(Integer i=0;i<ids.size();i++){
            if (!storeStorage.contains(ids.get(i))){storeStorage.add(ids.get(i));}
            else {ids.remove(i);}
            }
        return storeStorage;
        }



    @Override
    public List<Integer> get() {
        return storeStorage;
    }
}
