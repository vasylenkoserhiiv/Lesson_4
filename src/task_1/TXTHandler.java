package task_1;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open(String file){
        System.out.println("Документ відкрито в форматі TXT.");
    }
    @Override
    public void create(String file){
        System.out.println("Документ створено в форматі TXT.");
    }
    @Override
    public void change(){
        System.out.println("Документ зміненов форматі TXT.");
    }
    @Override
    public void save(){
        System.out.println("Документ збережено в форматі TXT.");
    }
}
