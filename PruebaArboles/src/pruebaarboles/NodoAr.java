package pruebaarboles;

public class NodoAr {

    private Integer informacion;
    private Integer hijoIzq;
    private Integer hijoDer;

    public NodoAr(Integer informacion) {
        this.informacion = informacion;
    }

    public NodoAr(Integer informacion, Integer hijoIzq, Integer hijoDer) {
        this.informacion = informacion;
        this.hijoIzq = hijoIzq;
        this.hijoDer = hijoDer;
    }

    public Integer getInformacion() {
        return informacion;
    }

    public void setInformacion(Integer informacion) {
        this.informacion = informacion;
    }

    public Integer getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(Integer hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Integer getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(Integer hijoDer) {
        this.hijoDer = hijoDer;
    }

    @Override
    public String toString() {
        return "NodoAr{" + "informacion=" + informacion + ", hijoIzq=" + hijoIzq + ", hijoDer=" + hijoDer + '}';
    }

}
