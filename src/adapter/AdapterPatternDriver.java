package adapter;


public class AdapterPatternDriver {
    
    public static void main(String args[]) {
    	Movable bugattiVeyron = new BugattiVeyron();
    	System.out.println("Bugatti Veyron�� �ְ�ӵ���: " + bugattiVeyron.getSpeed() + " MPH.");

        // MovableAdapter �� ���� MPH�� KPH�� ��ȯ
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Bugatti Veyron�� �ְ�ӵ���: " + bugattiVeyronAdapter.getSpeed() + " Km/h.");

    }
}
