package dll;
public class DoubleLinkedLists14 {
    Node14 head, tail;
    private int size;

    public DoubleLinkedLists14() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addFirst(Mahasiswa14 data) {
        Node14 newNode = new Node14(null, data, head);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(Mahasiswa14 data) {
        Node14 newNode = new Node14(tail, data, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void add(int index, Mahasiswa14 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node14 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node14 newNode = new Node14(current, data, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong!");
        } else if (head == tail) {
            System.out.println("Data terhapus: " + head.data);
            head = tail = null;
            size--;
        } else {
            System.out.println("Data terhapus: " + head.data);
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong!");
        } else if (head == tail) {
            System.out.println("Data terhapus: " + tail.data);
            head = tail = null;
            size--;
        } else {
            System.out.println("Data terhapus: " + tail.data);
            Node14 temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            size--;
        }
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("List kosong!");
            return;
        }
        Node14 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + key);
            return;
        }

        Node14 toRemove = current.next;
        System.out.println("Data terhapus setelah NIM " + key + ": " + toRemove.data);
        
        current.next = toRemove.next;
        if (toRemove.next != null) {
            toRemove.next.prev = current;
        } else {
            tail = current;
        }
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return;
        }
        
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node14 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("Data terhapus pada indeks " + index + ": " + current.data);
            
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public Mahasiswa14 getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong!");
            return null;
        }
        return head.data;
    }

    public Mahasiswa14 getLast() {
        if (isEmpty()) {
            System.out.println("List kosong!");
            return null;
        }
        return tail.data;
    }

    public Mahasiswa14 getIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid!");
            return null;
        }
        
        Node14 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
        } else {
            Node14 current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }    

    public void searchByNIM(String nim) {
        Node14 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                System.out.println(current.data);
                return;
            }
            current = current.next;
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    public void insertAfter(String key, Mahasiswa14 data) {
        Node14 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current != null) {
            Node14 newNode = new Node14(current, data, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
            size++;
            System.out.println("Data berhasil disisipkan setelah NIM " + key);
        } else {
            System.out.println("NIM tidak ditemukan!");
        }
    }
}