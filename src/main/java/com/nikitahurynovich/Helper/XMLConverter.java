package com.nikitahurynovich.Helper;

import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Models.Flowers.FlowerList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by computer on 29.10.2017.
 */
public class XMLConverter {

    public static void convertToFile(FlowerList flowers, File file) {

        try  {
            JAXBContext jaxbContext = JAXBContext.newInstance(FlowerList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.marshal(flowers, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void convertToStream(FlowerList flowers, OutputStream out) {

        try  {
            JAXBContext jaxbContext = JAXBContext.newInstance(FlowerList.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.marshal(flowers, out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static FlowerList convertFromFile(File file) {

        FlowerList flowerList = null;
        try  {
            JAXBContext jaxbContext = JAXBContext.newInstance(FlowerList.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            flowerList = (FlowerList) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return flowerList;
    }
}
