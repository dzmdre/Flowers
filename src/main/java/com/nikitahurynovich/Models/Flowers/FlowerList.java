package com.nikitahurynovich.Models.Flowers;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by computer on 29.10.2017.
 */
@XmlRootElement
public class FlowerList {

    private List<Flower> flowers = new ArrayList<>();

    public List<Flower> getFlowers() {
        return flowers;
    }


    @XmlElementWrapper(name = "flowers")
    @XmlElements({
            @XmlElement(name = "Aster", type = Aster.class),
            @XmlElement(name = "Chryzanthenun", type = Chryzanthenun.class),
            @XmlElement(name = "Rose", type = Rose.class),
            @XmlElement(name = "Hyacinth", type = Hyacinth.class)
    })
    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }


}
