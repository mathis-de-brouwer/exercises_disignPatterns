import CaffeniatedBeverages.*;
import Conversion.*;

public class Main {
    public static void main(String[] args) {

        FileConverter mp3 = new WavToMp3();
        FileConverter mpg = new AviToMpg();
        FileConverter xls = new CvsToXls();

        mp3.convertFile("hah.wav", "./destination");
        mpg.convertFile("aie.avi", "./destination");
        xls.convertFile("oef.cvs", "./destination");

//        Beverages coffee = new Coffee();
//        Beverages tea = new Tea();
//
//        System.out.println("coffee");
//        coffee.prepareRecipe();
//        System.out.println("tea");
//        tea.prepareRecipe();


    }
}