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
    public void add(Integer id) {
        if (storeStorage.contains(id)){throw new ProductAlreadyAddedExeption();}
        storeStorage.add(id);
    }

    @Override
    public List<Integer> get() {
        return storeStorage;
    }
}
