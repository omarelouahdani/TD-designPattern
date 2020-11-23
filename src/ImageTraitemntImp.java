public abstract class ImageTraitemntImp {

    private static ImageTraitemntImp imageTraitemntImp;

    public abstract void traiter();


    public static ImageTraitemntImp getInstance(String className){
        try {
            if(imageTraitemntImp==null || imageTraitemntImp.getClass().getName().equals(className)){
                imageTraitemntImp = (ImageTraitemntImp) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return imageTraitemntImp;
    }
}
