public class listaEnlazada {
    private Nodos cabeza;
    

        public listaEnlazada() {
            this.cabeza = null;
        }
    
   
        public void insertar(int dato) {
            Nodos nuevoNodo = new Nodos(dato);
            if (cabeza == null) {
                cabeza = nuevoNodo;
            } else {
                Nodos temp = cabeza;
                while (temp.siguiente != null) {
                    temp = temp.siguiente;
                }
                temp.siguiente = nuevoNodo;
            }
        }
    
 
        public void eliminar(int dato) {
            if (cabeza == null) return;
    
            if (cabeza.dato == dato) {
                cabeza = cabeza.siguiente;
                return;
            }
    
            Nodos temp = cabeza;
            while (temp.siguiente != null && temp.siguiente.dato != dato) {
                temp = temp.siguiente;
            }
    
            if (temp.siguiente != null) {
                temp.siguiente = temp.siguiente.siguiente;
            }
        }

        public boolean buscar(int dato) {
            Nodos temp = cabeza;
            while (temp != null) {
                if (temp.dato == dato) {
                    return true;
                }
                temp = temp.siguiente;
            }
            return false;
        }
    
   
        public void recorrer() {
            Nodos temp = cabeza;
            while (temp != null) {
                System.out.print(temp.dato + " ");
                temp = temp.siguiente;
            }
            System.out.println();
        }
    
      
        public boolean estaVacia() {
            return cabeza == null;
        }

}
