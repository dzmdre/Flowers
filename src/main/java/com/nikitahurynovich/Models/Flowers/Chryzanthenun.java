package com.nikitahurynovich.Models.Flowers;

import com.nikitahurynovich.Types.ColorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Chryzanthenun extends Flower {

    public static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.YELLOW);
    private final static String ASTER = "Chryzanthenun";

    @XmlElement
    private int countOfHeads;


    public Chryzanthenun () {
        super();
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
        countOfHeads = randomGenerator.nextInt(10) + 5;
        name = ASTER;
    }


    @Override
    public int calculatePrice() {
        return price = freshness + steelLength + weight - smellLevel + countOfHeads;
    }
    public static Builder getBuilder() {
        return new Chryzanthenun().new Builder();
    }

    public class Builder extends Flower.Builder {

        private Builder() {
        }

        public Builder countOfHeads(int countOfHeads) {
            Chryzanthenun.this.countOfHeads = countOfHeads;
            return this;
        }


        @Override
        public Flower build() {
            Chryzanthenun.this.setPrice(Chryzanthenun.this.calculatePrice());
            return Chryzanthenun.this;
        }
    }
}

