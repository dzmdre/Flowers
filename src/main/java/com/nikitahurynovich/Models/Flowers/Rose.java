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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Rose extends Flower {

    public static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.RED, ColorType.YELLOW);
    private final static String ROSE = "Rose";

    @XmlElement
    private int spikeCount;

    public Rose() {
        super();
        spikeCount = randomGenerator.nextInt(10) + 5;
        name = ROSE;
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
    }

    @Override
    public int calculatePrice() {
        return freshness + steelLength + weight + smellLevel - spikeCount;
    }


    public int getSpikeCount() {
        return spikeCount;
    }

    public void setSpikeCount(int spikeCount) {
        this.spikeCount = spikeCount;
    }

    public static Builder getBuilder() {
        return new Rose().new Builder();
    }


    public class Builder extends Flower.Builder {

        private Builder() {
        }

        public Builder spikeCount(int spikeCount) {
            Rose.this.spikeCount = spikeCount;
            return this;
        }


        @Override
        public Flower build() {
            Rose.this.setPrice(Rose.this.calculatePrice());
            return Rose.this;
        }
    }

}
