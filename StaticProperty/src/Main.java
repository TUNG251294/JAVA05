public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford","skyactiv1");
        System.out.println(car1.getName());
        System.out.println(car1.getEngine());
        System.out.println(Car.NumberOfCar);
        Car car2 = new Car("BMW", "skyactiv2");
        System.out.println(Car.NumberOfCar);
        Car car3 = new Car("Mercedes","skyactiv3");
        car1.setName("Volvo");
        System.out.println(Car.NumberOfCar);
        //1 thuộc tính được khai báo static, thì 1 bản sao của thuộc tính đó được tạo và chia sẻ
        //giữa tất cả các đối tượng của lớp. luôn chỉ có 1 bản sao của thuộc tính tĩnh
    }
}