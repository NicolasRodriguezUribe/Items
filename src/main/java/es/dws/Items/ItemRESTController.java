package es.dws.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRESTController {
    @Autowired
    ItemHolder itemHolder;

    @PostMapping("/item")
    public String create(Item item){
        itemHolder.
    }
}
