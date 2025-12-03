public boolean masElementos(ColaInt q2) {
    ColaInt aux = new ColaInt(); 
    ColaInt aux2 = new ColaInt(); 
    int contador1 = 0;
    int contador2 = 0;

    while (!this.esVacia()) {
        int auxElem = this.descolar();
        aux.entalar(auxElem);
        contador1++;
    }
    while (!aux.esVacia()) {
        int auxElem = aux.descolar();
        this.encolar(auxElem);
    }

    
    while (!q2.esVacia()) {
        int auxElem2 = q2.descolar();
        aux2.encolar(auxElem2);
        contador2++;
    }
    while (!aux2.esVacia()) {
        int auxElem2 = aux2.descolar();
        q2.encolar(auxElem2);
    }

    return contador1 > contador2;
}