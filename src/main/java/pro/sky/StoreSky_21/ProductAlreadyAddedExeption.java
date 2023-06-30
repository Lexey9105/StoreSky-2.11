package pro.sky.StoreSky_21;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class ProductAlreadyAddedExeption extends RuntimeException{

    public ProductAlreadyAddedExeption(){
        super("Товар уже добавден");
    }
}

