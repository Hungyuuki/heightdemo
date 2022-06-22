public class Operation {
    int height = 150;

    public void change(Operation human) {
        human.height = human.height + 30;
    }


    public static void main(String[] args) {
        Operation human = new Operation();//Tạo đối tượng human
        Operation dog = new Operation();
        System.out.println("Before change:");
        System.out.println(human); //In ra địa chỉ ô nhớ đối tượng human
        System.out.println(human.height); //In ra tham chiếu trỏ đến đối tượng human
        System.out.println();
        human.change(human); //Dùng hàm change
        System.out.println("After change:");
        System.out.println(human); //In ra địa chỉ ô nhớ đối tượng human
        System.out.println(human.height); //In ra tham chiếu trỏ đến đối tượng human

    }
}
