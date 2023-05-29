class ParkingSystem{
    int count[] ;
    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        return count[carType-1]-- > 0;
    }
}
public class ImplementParkingSystem{
        public static void main(String args[]){
                ParkingSystem ps = new ParkingSystem(1, 1, 0);
                System.out.println(ps.addCar(1));
                System.out.println(ps.addCar(2));
                System.out.println(ps.addCar(3));
                System.out.println(ps.addCar(1));

        }
}