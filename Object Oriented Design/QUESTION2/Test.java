public class Test {
    public static void main(String[] args) {
        Product skateboard = new Product("skateboard",15.6f);
        Product wheel = new Product("wheel",4.0f);
        Product board = new Product("board",6.0f);
        Product axle = new Product("axle",4.0f);
        Product screw = new Product("screw",2.0f);
        Product tire = new Product("tire",1.0f);
        Product rim = new Product("rim",4.0f);
        /*les composants de skateboard */
        skateboard.addComponent(wheel,4);
        skateboard.addComponent(board,1);
        skateboard.addComponent(axle,2);
        skateboard.addComponent(screw,8);
        /*les composants d'un wheel */
        wheel.addComponent(tire,1);
        wheel.addComponent(rim,1);
        screw.addComponent(screw,8);

        System.out.println(wheel.getProduct().name);
        System.out.println(board.getProduct().name);
        /*on test le produit composant screw car il admet deux parents  */
        System.out.println(screw.getProduct().name);
    }
}