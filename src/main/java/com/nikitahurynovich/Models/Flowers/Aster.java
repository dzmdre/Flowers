package com.nikitahurynovich.Models.Flowers;

import com.nikitahurynovich.Types.ColorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Aster extends Flower {
    public static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.YELLOW, ColorType.BLUE);
    private final static String ASTER = "Aster";

    @XmlElement
    private int bulk;


    public Aster () {
        super();
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
        bulk = randomGenerator.nextInt(10) + 5;
        name = ASTER;
    }


    @Override
    public int calculatePrice() {
        return freshness + steelLength + weight + smellLevel + bulk;
    }


    public static Builder getBuilder() {
        return new Aster().new Builder();
    }

    public class Builder extends Flower.Builder {

        private Builder() {
        }

        public Builder bulk(int bulk) {
            Aster.this.bulk = bulk;
            return this;
        }


        @Override
        public Flower build() {
            Aster.this.setPrice(Aster.this.calculatePrice());
            return Aster.this;
        }
    }

}
