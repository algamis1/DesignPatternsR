
import java.util.LinkedList;
import java.util.Queue;

public class fila {
    private static fila instancia;

    private List<String> documentos;

    private Fila() {
        documentos = new ArrayList<>();
    }

    public static synchronized fila getInstance() {
        if (instancia == null) {
            instancia = new fila();
        }
        return instancia;
    }

    public void adicionarDocumento(String documento) {
        documentos.add(documento);
    }
    public String removerProximoDocumento() {
        if (!documentos.isEmpty()) {
            return documentos.remove(0);
        }
        return null;
    }

    // Método para verificar se a fila está vazia
    public boolean estaVazia() {
        return documentos.isEmpty();
    }
}

class RemoveDocumento {
    public String removerUmDocumento(Fila fila) {
        return fila.removerProximoDocumento();
    }
}

class ImprimeDocumento {
    public static void imprimir(String documento) {
        System.out.println("Imprimindo documento: " + documento);
    }
}

class RemoveTodosDocumentos {
    public void removerTodos(Fila fila) {
        while (!fila.estaVazia()) {
            String documento = fila.removerProximoDocumento();
            System.out.println("Removido documento: " + documento);
        }
    }
}
