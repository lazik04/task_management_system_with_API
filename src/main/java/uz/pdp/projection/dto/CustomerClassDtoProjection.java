package uz.pdp.projection.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class CustomerClassDtoProjection {
    private Long id;
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private List<ProductClassDtoProjection> products;


}
