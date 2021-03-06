package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor //needed for Jackson to know how to construct
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 3248041125817704548L;

    private BeerDto beerDto;
}
