package task_1;

public class Main {
    public static void main(String[] args) {
        String file1 = "document.doc";
        String file2 = "document.txt";
        String file3 = "document.xml";

        String fileExtension = file1.substring(file1.lastIndexOf(".") + 1);

        AbstractHandler handler = new TXTHandler();

        switch (fileExtension) {
            case "xml":
                handler = new XMLHandler();
            case "doc":
                handler = new DOCHandler();
            case "txt":
                handler = new TXTHandler();
        }

        handler.create(file1);
        handler.open(file1);
        handler.change();
        handler.save();
    }
}
