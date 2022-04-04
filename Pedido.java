import java.util.ArrayList;
class Pedido {

    private String nombre;
    private boolean listo;
    private ArrayList<Articulo>items = new ArrayList<Articulo>();

    public Pedido(){
        this.nombre = "invitado";
        this.listo = false;
        
    }

    public Pedido(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean getListo(){
        return listo;
    }

    public void setListo(boolean listo){
        this.listo = listo;
    }


    public ArrayList<Articulo> getItems(){
        return this.items;
    }

    public void setItems(ArrayList<Articulo>items){
        this.items = items;
    }

    public void addArticulo(Articulo item){
        items.add(item);
    }

    
    public String getStatusMessage(){
        if(listo == true) {
            return "Tu pedido está listo";
        } else {
            return "Gracias por esperar. Tu pedido estará listo pronto";
        }
    }



    public double getOrderTotal(){
        double suma = 0;

        for(Articulo item: items){
            suma += item.precio;
        }
        return suma;
    } 

    public void display(){
        System.out.printf("Nombre del ciente: %s\n", nombre);
        for(Articulo item: items  ){  
        System.out.printf("precio: %s\n", item.precio);
        }
        double total = this.getOrderTotal(); 
        System.out.printf("Total: %s\n", total);
    }

}

