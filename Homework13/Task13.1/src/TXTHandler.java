public class TXTHandler extends AbstractHandler {
    @Override
    void create() {
        super.create();
        System.out.println("Створити документ TXT ");
    }
    @Override
    void open() {
        super.open();
        System.out.println("Відкрити документ TXT ");
    }
    @Override
    void change() {
        super.change();
        System.out.println("Змінити документ TXT ");
    }
    @Override
    void save() {
        super.save();
        System.out.println("Зберігти документ TXT ");
    }
}
