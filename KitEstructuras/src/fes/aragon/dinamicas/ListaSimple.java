package fes.aragon.dinamicas;


public class ListaSimple { //Las listas son agrupaciones de Nodos. Con dos nodos especialez; Cabeza y Cola
   protected Nodo cabeza;
   protected Nodo cola;
   protected int longitud;
    
   public ListaSimple(){
       cabeza=cola=null; //Cabeza y Cola valen Null
   }
   
   public void agregarEnCabeza(Object dato){
       cabeza=new Nodo(dato,cabeza);//Crea el objeto y regresa la diereccion 
       if(cola==null){
           cola=cabeza;
       }
       longitud ++;
   }
   
   public void agregarEnCola(Object dato){
       Nodo n = new Nodo(dato);
       if(cabeza==null){
           cabeza= cola = new Nodo(dato);
           //cabeza=cola;
       }else{
           cola.setSiguiente(new Nodo(dato));
           cola=cola.getSiguiente();
       }
   }
   
   public Object eliminarEnCabeza(){
       Object dato=0;
       if(cabeza!=null){ //Si cabeza tiene un dato
           dato=cabeza.getDato();
           if(cabeza==cola){//Si solo hay un elemento:
               cabeza=cola=null; //cambialos a null
           }else{
               cabeza=cabeza.getSiguiente();
           }
           longitud --;
       }
       return dato;
   }
   
   public Object eliminarEnCola(){
       Object dato=null;
       if(cola!=null){
           dato=cola.getDato();
           if(cabeza==cola){
               cabeza=cola=null;
           }else{
               Nodo tmp;
               for(tmp=cabeza; tmp.getSiguiente()!=cola; tmp=tmp.getSiguiente());
               cola=tmp;
               cola.setSiguiente(null);
           }
           longitud --;
       }
       return dato;
   }
   
   public boolean eliminaEnDato(Object dato){
        boolean borrado = false;
        if (cabeza != null) {
            if (cabeza == cola && dato.equals(cabeza.getDato()) ) {
                cabeza = cola = null;
                borrado = true;
            } else if (dato == cabeza.getDato()) {
                cabeza = cabeza.getSiguiente();
                borrado = true;
            } else {
                Nodo prd, tmp;
                for (prd = cabeza, tmp = cabeza.getSiguiente();
                        tmp != null && !tmp.getDato().equals(dato);
                        prd = prd.getSiguiente(), tmp = tmp.getSiguiente());
                if (tmp != null) {
                    borrado = true;
                    prd.setSiguiente(tmp.getSiguiente());
                    if (tmp == cola) {
                        cola = prd;
                    }
                }
            }
        }
        return borrado;
    }
   
   public void Localizador(Object elemento) {
        int conta = 0;
        for (Nodo tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
            if (tmp.getDato().equals(elemento)) {
                System.out.println("El elemento que buscas está en el índice: " + conta);
                break;
            }

            conta++;
            if (tmp == cola) {
                System.out.println("No encontré tu dato");
            }
        }

    }

   public boolean buscaDato(Object dato){
    Nodo tmp;
    for(tmp=cabeza; tmp!=null && !tmp.getDato().equals(dato); tmp=tmp.getSiguiente());
    return tmp!=null;
   }
   
   public void imprimirElementos(){
       for(Nodo tmp=cabeza; tmp!=null; tmp=tmp.getSiguiente()){
           System.out.println(tmp.getDato());
       }
   }
 
   public boolean esVacia(){
     return cabeza == null;
   }
   
   public int getLongitud(){
       return longitud;
   }
   
    public boolean estaEnLista(int dato) {
        boolean b = false;
        for (Nodo tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
            if (tmp.getDato().equals(dato)) {
                b = true;
            }
        }
        System.out.println(b);
        return b;

    }
    
    public boolean elliminarEnlista(Object dato) {
        boolean borrador = false;
        if (cabeza != null) {
            if (cabeza == cola && dato.equals(cabeza.getDato())) {
                cabeza = cola = null;
                borrador = true;
                longitud--;
            } else if (cabeza.getDato().equals(dato)) {
                cabeza = cabeza.getSiguiente();
                borrador = true;
                longitud--;
            } else {
                Nodo prd, tmp;
                for (prd = cabeza, tmp = cabeza.getSiguiente();
                        tmp != null && !tmp.getDato().equals(dato);
                        prd = prd.getSiguiente(), tmp = tmp.getSiguiente());
                if (tmp != null) {
                    borrador = true;
                    longitud--;
                    prd.setSiguiente(tmp.getSiguiente());
                    if (tmp == cola) {
                        cola = prd;
                    }
                }
            }
        }
        return true;
    }

    public void ParImpar(Object num) {
        Object i = 0;
        for (Nodo tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
            i = tmp.getDato();
        }
        //  if(i.equals(i%2)),

    }

    public void EliminarRepetidos() {
        boolean goma;
        Nodo prd, tmp;

        for (prd = cabeza, tmp = cabeza.getSiguiente();
                tmp != null && !tmp.getDato().equals(tmp.getDato());
                prd = prd.getSiguiente(), tmp = tmp.getSiguiente());
        if (tmp != null) {
            goma = true;
            prd.setSiguiente(tmp.getSiguiente());
            if (tmp == cola) {
                cola = prd;
            }

        }
    }

    public Object obtenerNodo(int indice) {
        Nodo tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;

            for (int conta = 0; conta < indice && tmp != null; conta++, tmp = tmp.getSiguiente());
        }
        if (tmp != null) {
            return tmp.getDato();
        } else {
            return null;
        }

    }

    public boolean insertarIndice(Object dato, int indice) {
        Nodo tmp = null;
        if (indice <= longitud) {
            tmp = cabeza;

            for (int conta = 0; conta < indice && tmp != null; conta++, tmp = tmp.getSiguiente());
        }
        if (tmp != null) {
            tmp.setDato(dato);
            return true;
        } else {
            return false;
        }

    }

    public boolean elliminarIndice(int indice) {
        boolean borrador = false;
        if (indice <= longitud) {
            if (cabeza != null) {
                if (cabeza == cola && indice == 0) {
                    cabeza = cola = null;
                    borrador = true;
                    longitud--;
                } else if (indice == 0) {
                    cabeza = cabeza.getSiguiente();
                    borrador = true;
                    longitud--;
                } else {
                    Nodo prd, tmp;
                    int conta = 1;
                    for (prd = cabeza, tmp = cabeza.getSiguiente();
                            conta < indice;
                            prd = prd.getSiguiente(), tmp = tmp.getSiguiente(), conta++);
                    if (tmp != null) {
                        borrador = true;
                        longitud--;
                        prd.setSiguiente(tmp.getSiguiente());
                        if (tmp == cola) {
                            cola = prd;
                        }
                    }
                }
            }
        }
return borrador;
    }

}
