package adapter;


public class AdapterPatternDriver {
    
    public static void main(String args[]) {
    	Movable bugattiVeyron = new BugattiVeyron();
    	System.out.println("Bugatti Veyron의 최고속도는: " + bugattiVeyron.getSpeed() + " MPH.");
    	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Bugatti Veyron의 최고속도는: " + bugattiVeyronAdapter.getSpeed() + " Km/h.");

    }
}
