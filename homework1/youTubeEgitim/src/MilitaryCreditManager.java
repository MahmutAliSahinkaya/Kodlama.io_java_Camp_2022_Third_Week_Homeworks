public class MilitaryCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        //hesaplamalar
        System.out.println("Asker kredisi hesaplandı");

    }

    @Override
    public void save() {
        System.out.println("Asker kredisi kaydedildi");

    }
}
