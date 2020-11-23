public class adabterImplNonStandard extends ImageTraitemntImp{

    private static adabterImplNonStandard instance;

    ImplNonStandard implNonStandard=new ImplNonStandard();
    @Override
    public void traiter() {
        implNonStandard.traiter();
        System.out.println("adabterImplNonStandard");
    }


}
