public void llena() {
    this.cantidad = this.capacidad;
}

public void vacia() {
    this.cantidad = 0;
}

public void llenaDesde(Jarra j) {
    while ((this.cantidad < this.capacidad) && (j.cantidad > 0)) {
        this.cantidad++;
        j.cantidad--;
    }
}

public String toString() {
    return "(" + this.capacidad + "," + this.cantidad + ")";
}

public int capacidad() {
    return this.capacidad;
}

public int cantidad() {
    return this.cantidad;
}
