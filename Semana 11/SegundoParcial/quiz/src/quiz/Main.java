import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingerManager singerManager = new SingerManager();
        InventoryManager inventoryManager = new InventoryManager();

        while (true) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Gestionar Cantantes");
            System.out.println("2. Gestionar Inventario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1: singerMenu(scanner, singerManager); break;
                case 2: inventoryMenu(scanner, inventoryManager); break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default: System.out.println("Opción inválida.");
            }
        }
    }

    private static void singerMenu(Scanner scanner, SingerManager manager) {
        while (true) {
            System.out.println("\n--- MENÚ CANTANTES ---");
            System.out.println("1. Adicionar nuevo cantante");
            System.out.println("2. Eliminar cantante por nombre artístico");
            System.out.println("3. Consultar existencia de cantante");
            System.out.println("4. Mostrar todos los cantantes");
            System.out.println("5. Mostrar cantantes por tipo de música");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int opt = Integer.parseInt(scanner.nextLine());

            switch (opt) {
                case 1:
                    System.out.print("Nombre real: ");
                    String realName = scanner.nextLine();
                    System.out.print("Nombre artístico: ");
                    String stageName = scanner.nextLine();
                    System.out.print("Edad: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Tipo de música: ");
                    String musicType = scanner.nextLine();
                    manager.addSinger(new Singer(realName, stageName, age, musicType));
                    break;
                case 2:
                    System.out.print("Nombre artístico a eliminar: ");
                    manager.removeSinger(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Nombre artístico a buscar: ");
                    System.out.println(
                        manager.existsSinger(scanner.nextLine()) ?
                        "El cantante existe." : "El cantante no existe."
                    );
                    break;
                case 4:
                    manager.showAll(); break;
                case 5:
                    System.out.print("Tipo de música: ");
                    manager.showByMusicType(scanner.nextLine());
                    break;
                case 0: return;
                default: System.out.println("Opción inválida.");
            }
        }
    }

    private static void inventoryMenu(Scanner scanner, InventoryManager manager) {
        while (true) {
            System.out.println("\n--- MENÚ INVENTARIO ---");
            System.out.println("1. Comprar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Aumentar precio de todos los productos");
            System.out.println("4. Modificar precio de un producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int opt = Integer.parseInt(scanner.nextLine());

            switch (opt) {
                case 1:
                    Product p = readProduct(scanner);
                    manager.buyProduct(p);
                    break;
                case 2:
                    System.out.print("Código a vender: ");
                    String code = scanner.nextLine();
                    System.out.print("Cantidad a vender: ");
                    int qty = Integer.parseInt(scanner.nextLine());
                    manager.sellProduct(code, qty);
                    break;
                case 3:
                    System.out.print("Porcentaje de aumento: ");
                    double pct = Double.parseDouble(scanner.nextLine());
                    manager.increaseAllPrices(pct);
                    break;
                case 4:
                    System.out.print("Código del producto: ");
                    String c2 = scanner.nextLine();
                    System.out.print("Nuevo precio: ");
                    double np = Double.parseDouble(scanner.nextLine());
                    manager.modifyPrice(c2, np);
                    break;
                case 5:
                    manager.showAll(); break;
                case 0: return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private static Product readProduct(Scanner scanner) {
        System.out.print("Código: ");    String code = scanner.nextLine();
        System.out.print("Nombre: ");    String name = scanner.nextLine();
        System.out.print("Tipo: ");      String type = scanner.nextLine();
        System.out.print("Precio: ");    double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Cantidad: ");  int qty = Integer.parseInt(scanner.nextLine());
        return new Product(code, name, type, price, qty);
    }
}

class Singer {
    private String realName, stageName, musicType;
    private int age;
    public Singer(String realName, String stageName, int age, String musicType) {
        this.realName = realName;
        this.stageName = stageName;
        this.age = age;
        this.musicType = musicType;
    }
    public String getStageName() { return stageName; }
    public String getMusicType() { return musicType; }
    @Override
    public String toString() {
        return String.format("Artístico: %s | Real: %s | Edad: %d | Género: %s",
            stageName, realName, age, musicType);
    }
}

class SingerManager {
    private java.util.List<Singer> singers;
    public SingerManager() {
        this.singers = new java.util.ArrayList<>();
    }
    public void addSinger(Singer s) {
        singers.add(s); System.out.println("Cantante agregado.");
    }
    public void removeSinger(String name) {
        boolean r = singers.removeIf(x -> x.getStageName().equalsIgnoreCase(name));
        System.out.println(r ? "Cantante eliminado." : "Cantante no encontrado.");
    }
    public boolean existsSinger(String name) {
        return singers.stream()
            .anyMatch(x -> x.getStageName().equalsIgnoreCase(name));
    }
    public void showAll() {
        if (singers.isEmpty()) System.out.println("No hay cantantes.");
        else singers.forEach(System.out::println);
    }
    public void showByMusicType(String type) {
        java.util.List<Singer> f = new java.util.ArrayList<>();
        for (Singer s: singers)
            if (s.getMusicType().equalsIgnoreCase(type))
                f.add(s);
        if (f.isEmpty()) System.out.println("No hay cantantes de ese género.");
        else f.forEach(System.out::println);
    }
}

class Product {
    private String code, name, type;
    private double price;
    private int quantity;
    public Product(String code, String name, String type,
                   double price, int quantity) {
        this.code = code; this.name = name; this.type = type;
        this.price = price; this.quantity = quantity;
    }
    public String getCode() { return code; }
    public int getQuantity() { return quantity; }
    public void increaseQuantity(int q) { quantity += q; }
    public boolean decreaseQuantity(int q) {
        if (q <= quantity) { quantity -= q; return true; }
        return false;
    }
    public void setPrice(double p) { price = p; }
    public void increasePriceByPercent(double pct) {
        price += price * pct / 100.0;
    }
    @Override
    public String toString() {
        return String.format("Código: %s | Nombre: %s | Tipo: %s | Precio: %.2f | Cantidad: %d",
            code, name, type, price, quantity);
    }
}

class InventoryManager {
    private java.util.List<Product> products;
    public InventoryManager() {
        products = new java.util.ArrayList<>();
    }
    public void buyProduct(Product p) {
        for (Product x : products) {
            if (x.getCode().equalsIgnoreCase(p.getCode())) {
                x.increaseQuantity(p.getQuantity());
                System.out.println("Cantidad actualizada.");
                return;
            }
        }
        products.add(p);
        System.out.println("Producto agregado.");
    }
    public void sellProduct(String code, int q) {
        for (Product x : products) {
            if (x.getCode().equalsIgnoreCase(code)) {
                if (x.decreaseQuantity(q))
                    System.out.println("Venta realizada.");
                else
                    System.out.printf("Solo %d unidades disponibles.%n", x.getQuantity());
                return;
            }
        }
        System.out.println("Producto no existe.");
    }
    public void increaseAllPrices(double pct) {
        for (Product x : products) x.increasePriceByPercent(pct);
        System.out.println("Precios actualizados.");
    }
    public void modifyPrice(String code, double np) {
        for (Product x : products) {
            if (x.getCode().equalsIgnoreCase(code)) {
                x.setPrice(np);
                System.out.println("Precio modificado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
    public void showAll() {
        if (products.isEmpty()) System.out.println("Inventario vacío.");
        else products.forEach(System.out::println);
    }
}
