package Conversion;

public abstract class FileConverter {
    public final void convertFile(String sourceFile, String destinationFolder ){
        name();
        validateSource(sourceFile);
        specifyDestionation(destinationFolder);
        calcApproxSize();
        checkSpace();
        metaTagInfo();
        perfConvertion();
    }

    public void validateSource(String sourceFile){
        System.out.println("validating file: "+ sourceFile);
    }
    public void specifyDestionation(String destinationFolder){
        System.out.println("Destination folder: "+ destinationFolder);
    }
    public void checkSpace(){
        System.out.println("checking space");
    }

    public abstract void name();
    public abstract void calcApproxSize();
    public abstract void metaTagInfo();
    public abstract void perfConvertion();

}
