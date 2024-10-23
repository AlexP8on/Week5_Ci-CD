package ie.atu.week6cicd;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Min(value= 0,message="You must enter a valid id")
    private int id;
    @NotBlank(message="You must enter a name")
    private String name;
   @PositiveOrZero(message="You must enter a valid price")
    private double price;
}
