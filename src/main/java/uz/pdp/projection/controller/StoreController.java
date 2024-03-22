package uz.pdp.projection.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.projection.dto.StoreDto;
import uz.pdp.projection.entity.Store;
import uz.pdp.projection.mepper.StoreMapper;
import uz.pdp.projection.repo.StoreRepo;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreController {
    private final StoreRepo storeRepo;
    @GetMapping
    private List<Store> get(){
        return storeRepo.findAll();
    }

    @PostMapping("/create")
    private StoreDto create(@RequestBody Store store){
        Store save = storeRepo.save(store);
        return StoreMapper.INSTANCE.mapToDto(save);
    }
}
