import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("Café de Goteo", 4.40);
        String articulo1Nombre = articulo1.getNombre();
        double articulo1Precio = articulo1.getPrecio();
        System.out.printf("Nombre: %s y el Precio es %s\n", articulo1Nombre, articulo1Precio);

        Articulo articulo2 = new Articulo("Capuchino", 3.28);
        String articulo2Nombre = articulo2.getNombre();
        double articulo2Precio = articulo2.getPrecio();
        System.out.printf("Nombre: %s y el Precio es %s\n", articulo2Nombre, articulo2Precio);

        Articulo articulo3 = new Articulo("Latte", 5.68);
        String articulo3Nombre = articulo3.getNombre();
        double articulo3Precio = articulo3.getPrecio();
        System.out.printf("Nombre: %s y el Precio es %s\n", articulo3Nombre, articulo3Precio);

        Articulo articulo4 = new Articulo("Moka", 3.87);
        String articulo4Nombre = articulo4.getNombre();
        double articulo4Precio = articulo4.getPrecio();
        System.out.printf("Nombre: %s y el Precio es %s\n", articulo4Nombre, articulo4Precio);

        Pedido pedido1 = new Pedido();
        String pedido1Nombre = pedido1.getNombre();
        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo4);
        pedido1.display();
        pedido1.setListo(false);
        System.out.printf("Nombre: %s\n", pedido1Nombre);
        String mensaje1 = pedido1.getStatusMessage();
        System.out.printf("Estado del Pedido: %s\n", mensaje1);

        Pedido pedido2 = new Pedido();
        String pedido2Nombre = pedido2.getNombre();
        pedido2.addArticulo(articulo3);
        pedido2.addArticulo(articulo4);
        pedido2.display();
        System.out.printf("Nombre: %s\n", pedido2Nombre);
        pedido2.setListo(true);
        String mensaje2 = pedido2.getStatusMessage();
        System.out.printf("Estado del Pedido: %s\n", mensaje2);

        Pedido pedido3 = new Pedido("Paul");
        String pedido3Nombre = pedido3.getNombre();
        pedido3.addArticulo(articulo1);
        pedido3.addArticulo(articulo2);
        pedido3.display();
        System.out.printf("Nombre: %s\n", pedido3Nombre);
        pedido3.setListo(true);
        String mensaje3 = pedido3.getStatusMessage();
        System.out.printf("Estado del Pedido: %s\n", mensaje3);
        

        Pedido pedido4 = new Pedido("Maria");
        String pedido4Nombre = pedido4.getNombre();
        System.out.printf("Nombre: %s\n", pedido4Nombre);
        pedido4.addArticulo(articulo2);
        pedido4.addArticulo(articulo4);
        pedido4.display();
        pedido4.setListo(false);
        String mensaje4 = pedido4.getStatusMessage();
        System.out.printf("Estado del Pedido: %s\n", mensaje4);
        
        Pedido pedido5 = new Pedido("Jorge");
        String pedido5Nombre = pedido5.getNombre();
        System.out.printf("Nombre: %s\n", pedido5Nombre);

    }
        
        
        
        
        
        
        
        
        // Pedido pedido1 = new Pedido();
        
        // pedido1.nombre = "Luciano";
        // pedido1.total = 2;
        // pedido1.listo = true;
        
        

        // System.out.printf("Nombre: %s\n", pedido1.nombre);
        // System.out.printf("Total: %s\n", pedido1.total);
        // System.out.printf("Listo: %s\n", pedido1.listo);
        
    //     Articulo articulo1 = new Articulo();
    //     articulo1.nombre = "moka";
    //     articulo1.precio = 5;
        
    //     Articulo articulo2 = new Articulo();
    //     articulo2.nombre = "latte";
    //     articulo2.precio = 3;
        
    //     Articulo articulo3 = new Articulo();
    //     articulo3.nombre = "cafe de goteo";
    //     articulo3.precio = 4;
        
    //     Articulo articulo4 = new Articulo();
    //     articulo4.nombre = "capuchino";
    //     articulo4.precio = 6;

    //     Pedido pedido1 = new Pedido();
        
    //     pedido1.nombre = "Cindhuri";
    //     System.out.println(pedido1.total);
        
    //     Pedido pedido2 = new Pedido();
    //     pedido2.nombre = "Jimmy";
        
    //     Pedido pedido3 = new Pedido();
    //     pedido3.nombre = "Noah";
        
    //     Pedido pedido4 = new Pedido();
    //     pedido4.nombre = "Sam";
        
        
    //     pedido2.items.add(articulo1);
    //     pedido2.total += articulo1.precio;

    //     pedido3.items.add(articulo4);
    //     pedido3.total += articulo4.precio;

    //     pedido4.items.add(articulo2);
    //     pedido4.total += articulo2.precio;

    //     pedido1.listo = true;

    //     pedido4.items.add(articulo2);
    //     pedido4.items.add(articulo2);
    //     pedido4.total += articulo2.precio *2;

    //     pedido2.listo = true;

    //     //Imprimiendo todo

    //     System.out.printf("Nombre: %s\n", pedido1.nombre);
    //     System.out.printf("Total: %s\n", pedido1.total);
    //     System.out.printf("Listo: %s\n", pedido1.listo);
        
    //     System.out.printf("Nombre: %s\n", pedido2.nombre);
    //     System.out.printf("Total: %s\n", pedido2.total);
    //     System.out.printf("Listo: %s\n", pedido2.listo);
        
    //     System.out.printf("Nombre: %s\n", pedido3.nombre);
    //     System.out.printf("Total: %s\n", pedido3.total);
    //     System.out.printf("Listo: %s\n", pedido3.listo);
        
    //     System.out.printf("Nombre: %s\n", pedido4.nombre);
    //     System.out.printf("Total: %s\n", pedido4.total);
    //     System.out.printf("Listo: %s\n", pedido4.listo);

        
    // }
}
