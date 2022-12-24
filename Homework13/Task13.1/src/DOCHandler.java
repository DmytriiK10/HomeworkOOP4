public class DOCHandler extends AbstractHandler {
    @Override
    void create() {
        super.create();
        System.out.println("Створити документ DOC ");
    }
    @Override
    void open() {
        super.open();
        System.out.println("Відкрити документ DOC ");
    }
    @Override
    void change() {
        super.change();
        System.out.println("Змінити документ DOC ");
    }

    @Override
    void save() {
        super.save();
        System.out.println("Зберігти документ DOC ");
    }
}
