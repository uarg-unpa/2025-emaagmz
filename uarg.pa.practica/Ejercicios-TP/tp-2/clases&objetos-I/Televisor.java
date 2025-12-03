// Punto 4 - TP Clases & Objetos I
public class Televisor {
    private String marca;
    private int tamanio; 
    private String resolucion;
    private boolean encendido;
    private int canalActual;
    private int volumen;
    private int canalAnterior;

    public Televisor(String marca, int tamanio, String resolucion) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.resolucion = resolucion;
        this.encendido = false;
        this.canalActual = 1;
        this.canalAnterior = 1;
        this.volumen = 10;
    }

    // Get y Set
     public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public int getVolumen() {
        return volumen;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido.");
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Televisor apagado.");
        } else {
            System.out.println("El televisor ya está apagado.");
        }
    }

    public void subirCanal() {
        if (encendido) {
            canalAnterior = canalActual;
            canalActual++;
            System.out.println("Canal cambiado a: " + canalActual);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void bajarCanal() {
        if (encendido) {
            canalAnterior = canalActual;
            if (canalActual > 1) {
                canalActual--;
                System.out.println("Canal cambiado a: " + canalActual);
            } else {
                System.out.println("Ya estás en el canal más bajo.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void subirVolumen() {
        if (encendido) {
            if (volumen < 100) {
                volumen++;
                System.out.println("Volumen: " + volumen);
            } else {
                System.out.println("Volumen máximo alcanzado.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void bajarVolumen() {
        if (encendido) {
            if (volumen > 0) {
                volumen--;
                System.out.println("Volumen: " + volumen);
            } else {
                System.out.println("Volumen mínimo alcanzado.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void cambiarCanal(int nuevoCanal) {
        if (encendido) {
            if (nuevoCanal > 0) {
                canalAnterior = canalActual;
                canalActual = nuevoCanal;
                System.out.println("Canal cambiado a: " + canalActual);
            } else {
                System.out.println("Número de canal inválido.");
            }
        } else {
            System.out.println("El televisor está apagado.");
        }
    }

    public void volverCanalAnterior() {
        if (encendido) {
            int temp = canalActual;
            canalActual = canalAnterior;
            canalAnterior = temp;
            System.out.println("Volvió al canal anterior: " + canalActual);
        } else {
            System.out.println("El televisor está apagado.");
        }
    }
}
