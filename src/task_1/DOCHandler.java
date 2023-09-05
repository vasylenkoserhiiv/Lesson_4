package task_1;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open(String file){
        System.out.println("Документ відкрито в форматі DOC.");
    }
    @Override
    public void create(String file){
        System.out.println("Документ створено в форматі DOC.");
    }
    @Override
    public void change(){
        System.out.println("Документ зміненов форматі DOC.");
    }
    @Override
    public void save(){
        System.out.println("Документ збережено в форматі DOC.");
    }
}
