import ra.Category;
import ra.Product;

public class Main {
    public static void main(String[] args) {
        Category category = new Category(1,"quan");
        Category category1 = new Category(2,"ao");
        Product product = new Product(1,"quan dai",333.3f,category);
        Product product1 = new Product(2,"ao dai",23.3f,category1);
        Product product2 = new Product(3,"quan dui",6454.3f,category);
        Product product3 = new Product(4,"quan bo",234.3f,category);
        Product product4 = new Product(5,"ao coc",86.3f,category1);
        Product product5 = new Product(6,"ao ba lo",133.3f,category1);
        Product product6 = new Product(7,"ao mua",9765.3f,category1);
        System.out.println("Tat ca san pham");
        System.out.println(category.display());
        System.out.println(category1.display());
        System.out.println(product.display());
        System.out.println(product1.display());
        System.out.println(product2.display());
        System.out.println(product3.display());
        System.out.println(product4.display());
        System.out.println(product5.display());
        System.out.println(product6.display());
    }
}