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
public class Hyacinth extends Flower {
    public static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.RED, ColorType.YELLOW, ColorType.VIOLET);
    private final static String Hyacinth = "Hyacinth";

    @XmlElement
    private int headLength;

    public Hyacinth() {
        super();
        headLength = randomGenerator.nextInt(10) + 5;
        name = Hyacinth;
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
    }

    @Override
    public int calculatePrice() {
        return freshness + steelLength + weight - smellLevel + headLength;
    }


    public static Hyacinth.Builder getBuilder() {
        return new Hyacinth().new Builder();
    }

    public int getHeadLength() {
        return headLength;
    }

    public void setHeadLength(int headLength) {
        this.headLength = headLength;
    }

    public class Builder extends Flower.Builder {

        private Builder() {
        }

        public Builder headLength(int headLength) {
            Hyacinth.this.headLength = headLength;
            return this;
        }


        @Override
        public Flower build() {
            Hyacinth.this.setPrice(Hyacinth.this.calculatePrice());
            return Hyacinth.this;
        }
    }
}
