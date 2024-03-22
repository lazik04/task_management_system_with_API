package uz.pdp.projection.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class StoreDto {
    private Long id;
    private String name;
    private LocalTime open;
    private LocalTime close;
}
