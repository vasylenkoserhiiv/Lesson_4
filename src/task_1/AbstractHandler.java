package task_1;
/*
Створити клас AbstractHandler. У тілі класу створити методи void open(), void create(), void change(), void save().
Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler. Написати програму,
яка виконуватиме визначення документа і для кожного формату мають бути методи відкриття, створення, редагування,
збереження певного формату документа.
 */
public abstract class AbstractHandler {
    public abstract void open(String file);
    public abstract void create(String file);
    public abstract void change();
    public abstract void save();
}
