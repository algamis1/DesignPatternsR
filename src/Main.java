public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();

        fila.adicionarDocumento("Documento 1");
        fila.adicionarDocumento("Documento 2");
        fila.adicionarDocumento("Documento 3");

        RemoveDocumento removeDocumento = new RemoveDocumento();
        while (!fila.estaVazia()) {
            String documento = removeDocumento.removerUmDocumento(fila);
            ImprimeDocumento.imprimir(documento);
        }


        RemoveTodosDocumentos removeTodosDocumentos = new RemoveTodosDocumentos();
        removeTodosDocumentos.removerTodos(fila);
    }
}
