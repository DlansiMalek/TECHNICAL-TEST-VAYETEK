import java.util.ArrayList;
public class Product {
    String name;
    float price;
    ArrayList<Product> components = new ArrayList<Product>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Product> parents = new ArrayList<Product>();


    public Product(String name,Float price) {
        this.name = name;
        this.price = price;
    }
    /*fonction qui ajoute un composant qui compose ce produit */
    public void addComponent(Product product,int number) {
        this.components.add(product);
        this.numbers.add(number);
        product.parents.add(this);
    }
    /* fonction recursive qui retourne le produit root (originale)(au sommet de la hierarchie) */
    public Product getProduct() {
        if(this.parents.size()==0) {
            return this;
        } else {
            for(int i=0;i<this.parents.size();i++) {
                return this.parents.get(i).getProduct();
            }
            
        }
        return this;
    }
}