package uz.pdp.projection.mepper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.pdp.projection.dto.StoreDto;
import uz.pdp.projection.entity.Store;
@Mapper(componentModel = "spring")
public interface StoreMapper {
    StoreMapper INSTANCE = Mappers.getMapper(StoreMapper.class);
//    @Mapping(source = "info", target = "description")
    StoreDto mapToDto(Store store);



}
