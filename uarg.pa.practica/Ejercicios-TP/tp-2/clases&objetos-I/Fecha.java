// Punto 6 - TP Clases & Objetos I
/* 
 Una fecha se compone de 3 elementos: día, mes y año. Codificar la clase Fecha con los siguientes métodos:
 a) Cuando se crea el objeto de la clase Fecha, los valores de día, mes y año deben ser válidos (es decir, una fecha correcta). 
 Si alguno es inválido, generar la fecha 01/01/2013.
 b) Devolver el día; devolver el mes; devolver el año.
 c) Cambiar el día; cambiar el mes; cambiar el año.
 d) Obtener el nombre del mes de la fecha (ejemplo: si el mes es 1, obtener Enero).
 e) Mostrar la fecha de la siguiente forma: 1 de Setiembre de 2012.
*/

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        if(fechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }

    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        if(fechaValida(dia, this.mes, this.anio)) {
            this.dia = dia;
        }
    }

    public void setMes(int mes) {
        if (esFechaValida(this.dia, mes, this.anio)) {
            this.mes = mes;
        }
    }

    public void setAnio(int anio) {
        if (esFechaValida(this.dia, this.mes, anio)) {
            this.anio = anio;
        }
    }

    public String getNombreMes() {
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"
        };
        if (mes >= 1 && mes <= 12) {
            return nombresMeses[mes - 1];
        } else {
            return "Mes inválido";
        }
    }

    private boolean esFechaValida(int d, int m, int a) {
        if (a < 1) return false; 
        if (m < 1 || m > 12) return false;
        if (d < 1) return false;

        int maxDias = getDiasDelMes(m, a);
        if (d > maxDias) return false;

        return true;
    }
}
