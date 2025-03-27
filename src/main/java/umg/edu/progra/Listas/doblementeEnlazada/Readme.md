### 🐝  Lista Doblemente Enlazada en Java

📌 **Descripción:**  
Este proyecto implementa una **Lista Doblemente Enlazada** en Java con tres funcionalidades principales: contar los nodos, insertar después de un valor específico y revertir la lista.

---

## 🚀 Funcionalidades

### 🔢 1. Contar el número de nodos
Este método recorre la lista y cuenta cuántos nodos existen.

```java
public int contarNodos() {
    int count = 0;
    Nodo current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}
```



---

### 🏧 2. Insertar un nodo después de un valor específico
Permite agregar un nuevo nodo después de encontrar un valor determinado en la lista.

```java
public void insertarDespuesDe(int valor, int data) {
    Nodo current = head;
    while (current != null) {
        if (current.data == valor) {
            Nodo newNode = new Nodo(data);
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
            return;
        }
        current = current.next;
    }
}
```


---

### 🔄 3. Revertir la lista doblemente enlazada
Intercambia los punteros `prev` y `next` de cada nodo, invirtiendo la lista.

```java
public void revertirLista() {
    Nodo current = head;
    Nodo temp = null;
    while (current != null) {
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
    }
    if (temp != null) {
        head = temp.prev;
    }
}
```


---


## 📌 Uso
1. **Ejecutar la clase Pricipal: 
```
Listas/doblementeEnlazada/complementos/Principal.java
```
---

