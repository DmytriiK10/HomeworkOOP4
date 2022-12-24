public class XMLHandler extends AbstractHandler {


    @Override
    void change() {
        super.change();
        System.out.println("Змінити документ XML ");
    }
    @Override
    void open() {
        super.open();
    System.out.println("Відкрити документ XML "); }
    @Override
    void create() {
        super.create();
        System.out.println("Створити документ XML ");
    }

    @Override
    void save() {
        super.save();
        System.out.println("Зберігти документ XML ");
    }
}
