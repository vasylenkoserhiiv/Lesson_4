package task_1;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open(String file){
        System.out.println("Документ відкрито в форматі XML.");
    }
    @Override
    public void create(String file){
        System.out.println("Документ створено в форматі XML.");
    }
    @Override
    public void change(){
        System.out.println("Документ зміненов форматі XML.");
    }
    @Override
    public void save(){
        System.out.println("Документ збережено в форматі XML.");
    }
}
